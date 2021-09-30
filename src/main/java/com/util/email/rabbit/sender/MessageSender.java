package com.util.email.rabbit.sender;

import com.google.gson.Gson;
import com.util.email.model.ResponseEmail;

import com.util.email.model.ResponsePosmark;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Clase que envia mensaje a la cola con el contenido
 * 
 * @author fureche
 *
 */
public class MessageSender {

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private Queue queue;

	@Autowired
	private Gson gson;

	public void send(ResponsePosmark message) {
		this.template.convertAndSend(queue.getName(), gson.toJson(message));
	}

}
