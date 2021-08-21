package com.util.email.postmark;

import com.util.email.model.RequestEmail;
import com.util.email.model.ResponseEmail;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class EmailPostmarkService implements EmailPostmarkPort {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailPostmarkService.class);


    public ResponseEmail sendEmail(String url, RequestEmail email, String token) {
        JSONObject personJsonObject = new JSONObject();
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-Postmark-Server-Token", token);


        HttpEntity<String> request =
                new HttpEntity<String>(personJsonObject.toString(), headers);

        HttpEntity<RequestEmail> entity = new HttpEntity<RequestEmail>(email, headers);


        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<ResponseEmail> responseEntity = restTemplate.exchange(
                    url, HttpMethod.POST, entity,
                    ResponseEmail.class);

            if (responseEntity.getStatusCode() == HttpStatus.OK) {
                return responseEntity.getBody();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
	
