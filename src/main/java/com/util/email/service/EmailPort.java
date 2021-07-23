package com.util.email.service;

import com.util.email.model.EmailBody;

public interface EmailPort {
	public boolean sendEmail(EmailBody emailBody);
}