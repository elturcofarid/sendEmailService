package com.util.email.postmark.dto;

public class Recipient{
    public String emailAddress;
    public String messageId;
	
    public Recipient() {
		super();
	}
    
    
    public Recipient(String emailAddress, String messageId) {
		super();
		this.emailAddress = emailAddress;
		this.messageId = messageId;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getMessageId() {
		return messageId;
	}


	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
    
   
    
    
}
