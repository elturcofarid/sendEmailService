package com.util.email.model;

public class ResponsePosmark {

    private ResponseEmail response;

    private Data data;


    public ResponsePosmark(){}

    public ResponsePosmark(ResponseEmail response, Data data) {
        this.response = response;
        this.data = data;
    }

    public ResponseEmail getResponse() {
        return response;
    }

    public void setResponse(ResponseEmail response) {
        this.response = response;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
