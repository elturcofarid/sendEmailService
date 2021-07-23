package com.util.email.send.service;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SenderConfig {
   

    @Bean
    public SenderServices sender() {
	return new SenderServices();
    }
    
 
}