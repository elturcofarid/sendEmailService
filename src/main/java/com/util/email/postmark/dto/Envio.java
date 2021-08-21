/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util.email.postmark.dto;

import java.util.List;

public class Envio{
    public String fromAddress;
    public List<String> recipients;
    public String fromName;
    public String subject;
    public String bodyContent;
    public String replyTo;
    public boolean certification;
    public boolean embeddedAttachments;
    public boolean signAttachments;
    public String type;
    public List<Metadata> metadata;
    public List<Attachment> attachments;
	
    public Envio() {
		super();
	}
    
    public Envio(String fromAddress, List<String> recipients, String fromName, String subject, String bodyContent,
			String replyTo, boolean certification, boolean embeddedAttachments, boolean signAttachments, String type,
			List<Metadata> metadata, List<Attachment> attachments) {
		super();
		this.fromAddress = fromAddress;
		this.recipients = recipients;
		this.fromName = fromName;
		this.subject = subject;
		this.bodyContent = bodyContent;
		this.replyTo = replyTo;
		this.certification = certification;
		this.embeddedAttachments = embeddedAttachments;
		this.signAttachments = signAttachments;
		this.type = type;
		this.metadata = metadata;
		this.attachments = attachments;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public List<String> getRecipients() {
		return recipients;
	}

	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBodyContent() {
		return bodyContent;
	}

	public void setBodyContent(String bodyContent) {
		this.bodyContent = bodyContent;
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public boolean isCertification() {
		return certification;
	}

	public void setCertification(boolean certification) {
		this.certification = certification;
	}

	public boolean isEmbeddedAttachments() {
		return embeddedAttachments;
	}

	public void setEmbeddedAttachments(boolean embeddedAttachments) {
		this.embeddedAttachments = embeddedAttachments;
	}

	public boolean isSignAttachments() {
		return signAttachments;
	}

	public void setSignAttachments(boolean signAttachments) {
		this.signAttachments = signAttachments;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Metadata> getMetadata() {
		return metadata;
	}

	public void setMetadata(List<Metadata> metadata) {
		this.metadata = metadata;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
    
    
    
}