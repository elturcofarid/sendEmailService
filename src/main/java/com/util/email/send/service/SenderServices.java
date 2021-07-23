package com.util.email.send.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Random;

import javax.activation.FileDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.util.email.model.Attached;
import com.util.email.model.EmailBody;
import com.util.email.service.EmailService;

@Service
public class SenderServices implements SenderPort {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private EmailService port;

	@Autowired
	private Gson gson;

	public boolean sender(String message) {
		return sendEmail(message);
	}

	/*
	 * Convierte un Json en un correo electronico
	 */
	private boolean sendEmail(String message) {

		EmailBody body = gson.fromJson(message, EmailBody.class);
		List<FileDataSource> listAttacheds = new ArrayList<>();
		List<File> files = new ArrayList<>();
		boolean exit = false;
		try {
			
			
			
			
			for (Attached fileb64 : body.getBase64()) {
				byte[] b64 = Base64.getDecoder().decode(fileb64.getData());
				File file;
				
				String path = System.getProperty("user.dir")+ File.separator;
				
				if (fileb64.getName() == null) {
					file = new File( path + nameFile().trim() + ".pdf");
				} else {
					file = new File(path + fileb64.getName().trim() + ".pdf");
				}

				OutputStream os = new FileOutputStream(file);
				try {
					os.write(b64);
					os.close();
					listAttacheds.add(new FileDataSource(file));
					files.add(file);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					os.close();
				}
			}

			body.setAttached(listAttacheds);

			exit = port.sendEmail(body);

			for (File file : files) {
				if (file.delete()) {
					LOGGER.info("Archivo eliminado!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exit;
	}

	/*
	 * Metodo que permite crear una cadena aleatorea
	 */
	private String nameFile() {
		char n;
		Random rnd = new Random();
		StringBuilder name = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			n = (char) (rnd.nextDouble() * 26.0 + 65.0);
			name.append(n);
		}
		return name.toString();
	}

}
