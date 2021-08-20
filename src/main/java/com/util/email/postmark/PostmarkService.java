package com.util.email.postmark;

import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.util.email.model.Attached;
import com.util.email.model.EmailBody;
import com.util.email.model.MessageResponseDto;
import com.wildbit.java.postmark.Postmark;
import com.wildbit.java.postmark.client.ApiClient;
import com.wildbit.java.postmark.client.data.model.message.Message;
import com.wildbit.java.postmark.client.data.model.message.MessageResponse;

@Service
public class PostmarkService implements PostmarkImpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(PostmarkService.class);

	@Autowired
	private Gson gson; 
	
	@Override
	public MessageResponseDto sendEmail(String messageIn) {
		
		EmailBody body = gson.fromJson(messageIn, EmailBody.class);
		MessageResponse response = new MessageResponse ();
		
		try {
			ApiClient client = Postmark.getApiClient(body.getApiToken());
			Message message = new Message(body.getEmailFrom(), body.getEmail(), body.getSubject(), body.getContent());
			
			for (Attached  attached: body.getBase64()) {
				message.addAttachment(attached.getName(), Base64.getDecoder().decode(attached.getData()), "application/pdf");			
			}
			
			response = client.deliverMessage(message);
			System.out.println(response.getMessageId());
		} catch (Exception e) {
			LOGGER.error("Hubo un error al enviar el mail: " + body.getEmail() , e);
		}
		return mapperToDto(response);
	}	
	
	
	private MessageResponseDto mapperToDto(MessageResponse resp) {
		MessageResponseDto rest = new MessageResponseDto();
		rest.setBcc(resp.getBcc());
		rest.setCc(resp.getCc());
		rest.setErrorCode(resp.getErrorCode());
		rest.setMessage(resp.getMessage());
		rest.setMessageId(resp.getMessageId());
		rest.setSubmittedAt(resp.getSubmittedAt());
		rest.setTo(resp.getTo());
		return rest;
	}
	
}