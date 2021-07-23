package com.util.email.response.service;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResponseEmailConfig {

	@Value("${queue.response}")
	private String response;

	@Bean
	@Qualifier("response")
	public Queue responseEmail() {
		return new Queue(response);
	}

	@Bean
	public ResponseEmailSender senderEmail() {
		return new ResponseEmailSender();
	}
}
