package com.util.email.rabbit.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessageConfig {

 
	@Value("${queue.response}")
	private String cola;
	
    @Bean
    public Queue corresppondencia() {
	return new Queue(cola);
    }

  
    @Bean
    public MessageSender sender() {
	return new MessageSender();
    }

}