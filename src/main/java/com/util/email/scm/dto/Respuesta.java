package com.util.email.scm.dto;

import com.util.email.scm.dto.Recipient;

import java.util.List;

/**
	 *
	 * @author aecr1
	 */
public class Respuesta {
    public String responseText;
    public int statusCode;
    public List<Recipient> recipients;


    public Respuesta() {
		super();
	}
    
    public Respuesta(String responseText, int statusCode, List<Recipient> recipients) {
		super();
		this.responseText = responseText;
		this.statusCode = statusCode;
		this.recipients = recipients;
	}

	public String getResponseText() {
		return responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public List<Recipient> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<Recipient> recipients) {
		this.recipients = recipients;
	}

    
    
    
    
}