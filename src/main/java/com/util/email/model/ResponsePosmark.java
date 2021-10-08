package com.util.email.model;

public class ResponsePosmark {

    private ResponseEmail response;

    private Object data;


    public ResponsePosmark(){}

    public ResponsePosmark(ResponseEmail response, Object data) {
        this.response = response;
        this.data = data;
    }

    public ResponseEmail getResponse() {
        return response;
    }

    public void setResponse(ResponseEmail response) {
        this.response = response;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
