package com.util.email.scm;

import com.util.email.model.RequestEmail;
import com.util.email.scm.dto.Envio;
import com.util.email.scm.dto.Respuesta;

public interface EmailScmPort {


	public Respuesta sendEmail(String url, RequestEmail email, String token);
}