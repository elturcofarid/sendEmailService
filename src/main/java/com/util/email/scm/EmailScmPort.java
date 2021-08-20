package com.util.email.scm;

import com.util.email.scm.dto.Envio;
import com.util.email.scm.dto.Respuesta;

public interface EmailScmPort {


	public Respuesta sendEmail(String url, Envio correo, String token);
}