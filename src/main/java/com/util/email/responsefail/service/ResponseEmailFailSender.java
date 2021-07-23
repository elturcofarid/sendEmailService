package com.util.email.responsefail.service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.google.gson.Gson;

public class ResponseEmailFailSender {

	
	@Autowired
	private RabbitTemplate template;

	@Autowired
	@Qualifier("responseFail")
	private Queue queue;

	@Autowired
	private Gson gson;

	public void send(String message) {
		this.template.convertAndSend(queue.getName(), gson.toJson(message));
	}

}
