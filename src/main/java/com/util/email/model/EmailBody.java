package com.util.email.model;

import com.util.email.scm.dto.Envio;

import java.util.List;

import javax.activation.FileDataSource;


public class EmailBody {
	private String email;
	private String content;
	private String subject;
	private List<FileDataSource> attached;
	private List<Attached> base64;
	private String emailFrom;
	private String apiToken;
	private String provaider;

	public Envio getCorreo() {
		return correo;
	}

	public void setCorreo(Envio correo) {
		this.correo = correo;
	}

	private Envio correo;
	
	public String getProvaider() {
		return provaider;
	}
	public void setProvaider(String provaider) {
		this.provaider = provaider;
	}
	public String getApiToken() {
		return apiToken;
	}
	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;		
	}
	
	public List<FileDataSource> getAttached() {
		return attached;
	}
	public void setAttached(List<FileDataSource> attached) {
		this.attached = attached;
	}
		
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	
	
	public List<Attached> getBase64() {
		return base64;
	}
	public void setBase64(List<Attached> base64) {
		this.base64 = base64;
	}




	@Override
	public String toString() {
		return "EmailBody [email=" + email + ", content=" + content + ", subject=" + subject + "]";
	}
	
	
}
