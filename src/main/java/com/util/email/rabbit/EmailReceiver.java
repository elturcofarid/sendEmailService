package com.util.email.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import com.google.gson.Gson;
import com.util.email.model.EmailBody;
import com.util.email.model.MessageResponseDto;
import com.util.email.postmark.PostmarkService;
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

	@Autowired
	private PostmarkService postmark;

	@Autowired
	private Gson gson;

	@RabbitHandler
	@Async("threadPoolTaskExecutor")
	public void receive(String in) {
		try {

			EmailBody body = gson.fromJson(in, EmailBody.class);

			if (body.getProvaider() !=null && body.getProvaider().toLowerCase().equals("postmark")) {
				MessageResponseDto responseEmail = postmark.sendEmail(in);

				if (responseEmail.getErrorCode() > 0) {
					responseFail.send(gson.toJson(responseEmail));
				} else {
					response.send(gson.toJson(responseEmail));
				}
			}else {
				if (sender.sender(in)) {
					response.send(in);
				}else {
					responseFail.send(in);
				}
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
