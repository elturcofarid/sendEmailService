package com.util.email.postmark;

import com.util.email.model.MessageResponseDto;

public interface PostmarkImpl {
	public MessageResponseDto sendEmail(String message);
}