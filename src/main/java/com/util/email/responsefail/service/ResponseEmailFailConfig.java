package com.util.email.responsefail.service;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResponseEmailFailConfig {
	
	
	 
		@Value("${queue.response.fail}")
		private String response;
		
	    @Bean
	    @Qualifier("responseFail")
	    public Queue responseEmailFail() {
		return new Queue(response);
	    }

	  
	    @Bean
	    public ResponseEmailFailSender senderFail() {
		return new ResponseEmailFailSender();
	    }

	

}
