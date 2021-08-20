package com.util.email.service;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.util.email.model.EmailBody;

@Service
public class EmailService implements EmailPort {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private JavaMailSender sender;

	@Override
	public boolean sendEmail(EmailBody emailBody) {
		boolean send = false;
		MimeMessage message = sender.createMimeMessage();

		MimeMultipart multiParte = new MimeMultipart();

		BodyPart text = new MimeBodyPart();

		try {
			text.setContent(emailBody.getContent(), "text/html");
			multiParte.addBodyPart(text);

			for (FileDataSource file : emailBody.getAttached()) {
				BodyPart adjunto = new MimeBodyPart();
				adjunto.setDataHandler(new DataHandler(file));
				adjunto.setFileName(file.getName());
				multiParte.addBodyPart(adjunto);
			}

			message.setFrom(new InternetAddress(emailBody.getEmailFrom()));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailBody.getEmail()));
			message.setSubject(emailBody.getSubject());
			message.setContent(multiParte);

			sender.send(message);

			send = true;
			LOGGER.info("Mail enviado!");
		} catch (Exception e) {
			LOGGER.error("Hubo un error al enviar el mail: " + emailBody.getEmail() , e);
		}
		return send;
	}	
	
}