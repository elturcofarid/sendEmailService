package com.util.email.postmark;

import com.util.email.model.RequestEmail;
import com.util.email.model.ResponseEmail;

public interface EmailPostmarkPort {


	public ResponseEmail sendEmail(String url, RequestEmail email, String token);
}