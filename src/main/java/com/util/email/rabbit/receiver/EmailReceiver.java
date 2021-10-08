package com.util.email.rabbit.receiver;

import com.google.gson.Gson;
import com.util.email.model.DataRequest;
import com.util.email.model.RequestEmail;
import com.util.email.model.ResponseEmail;
import com.util.email.model.ResponsePosmark;
import com.util.email.postmark.EmailPostmarkPort;
import com.util.email.rabbit.sender.MessageSender;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailReceiver {

	@Autowired
	private Gson gson;

	@Autowired
	private EmailPostmarkPort emailScm;


	@Value("${email.scm.url}")
	private String url;

	//@Value("${email.scm.token}")
	//private String token;



@Autowired
private MessageSender sender;


	@RabbitListener(queues = "${queue.email}")
	public void receive(String in) {
		try {

			DataRequest data = gson.fromJson(in, DataRequest.class);

			RequestEmail email =  gson.fromJson(gson.toJson(data.getData()), RequestEmail.class);

			ResponseEmail response = emailScm.sendEmail(url,email,email.getAPiToken());

			sender.send(new ResponsePosmark(response, email.getData()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
