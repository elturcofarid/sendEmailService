package com.util.email.scm;

import com.util.email.model.RequestEmail;
import com.util.email.scm.dto.Envio;
import com.util.email.scm.dto.Respuesta;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class EmailScmService implements EmailScmPort {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailScmService.class);


    public Respuesta sendEmail(String url, RequestEmail email, String token) {
        JSONObject personJsonObject = new JSONObject();
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Postmark-Server-Token", token);


        HttpEntity<String> request =
                new HttpEntity<String>(personJsonObject.toString(), headers);

        HttpEntity<RequestEmail> entity = new HttpEntity<RequestEmail>(email, headers);


        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Respuesta> responseEntity = restTemplate.exchange(
                    url, HttpMethod.POST, entity,
                    Respuesta.class);

            if (responseEntity.getStatusCode() == HttpStatus.ACCEPTED) {
                return responseEntity.getBody();

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
	
