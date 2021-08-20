package com.util.email.service;

import com.util.email.model.EmailBody;
import org.springframework.scheduling.annotation.Async;

public interface EmailPort {


	public boolean sendEmail(EmailBody emailBody);
}