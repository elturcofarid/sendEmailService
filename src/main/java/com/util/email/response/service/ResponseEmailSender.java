package com.util.email.response.service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.google.gson.Gson;

public class ResponseEmailSender {

	
	@Autowired
	private RabbitTemplate template;

	@Autowired
	@Qualifier("response")
	private Queue queue;

	@Autowired
	private Gson gson;

	public void send(String message) {
		this.template.convertAndSend(queue.getName(), gson.toJson(message));
		System.out.println(" Enviado mensaje:" + message + " a la cola: " + queue.getName());
	}


}
