package com.util.email.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.util.email.response.service.ResponseEmailSender;
import com.util.email.responsefail.service.ResponseEmailFailSender;
import com.util.email.send.service.SenderServices;


@RabbitListener(queues = "${queue.email}")
public class EmailReceiver {

	@Autowired
	private SenderServices sender;
	
	@Autowired
	private ResponseEmailSender response;
	
	@Autowired
	private ResponseEmailFailSender responseFail;

	@RabbitHandler
	public void receive(String in) {
		try {
			if(sender.sender(in)) {
				response.send(in);
			}else {
				responseFail.send(in);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
