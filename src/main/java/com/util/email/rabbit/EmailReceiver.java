package com.util.email.rabbit;

import com.google.gson.Gson;
import com.util.email.model.RequestEmail;
import com.util.email.scm.EmailScmPort;
import com.util.email.scm.dto.Envio;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailReceiver {

	@Autowired
	private Gson gson;

	@Autowired
	private EmailScmPort emailScm;


	@Value("${email.scm.url}")
	private String url;

	@Value("${email.scm.token}")
	private String token;



	@RabbitListener(queues = "${queue.email}")
	public void receive(String in) {
		try {
			RequestEmail email = gson.fromJson(in, RequestEmail.class);
			emailScm.sendEmail(url,email,token);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
