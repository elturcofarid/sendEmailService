package com.util.email.model;

import java.util.Date;

/**
 * HTTP send request response object
 */
public class MessageResponseDto {

    private String To;
    private String SubmittedAt;
    private String MessageID;
    private float ErrorCode;
    private String Message;


    // Getter Methods

    public String getTo() {
        return To;
    }

    public String getSubmittedAt() {
        return SubmittedAt;
    }

    public String getMessageID() {
        return MessageID;
    }

    public float getErrorCode() {
        return ErrorCode;
    }

    public String getMessage() {
        return Message;
    }

    // Setter Methods

    public void setTo( String To ) {
        this.To = To;
    }

    public void setSubmittedAt( String SubmittedAt ) {
        this.SubmittedAt = SubmittedAt;
    }

    public void setMessageID( String MessageID ) {
        this.MessageID = MessageID;
    }

    public void setErrorCode( float ErrorCode ) {
        this.ErrorCode = ErrorCode;
    }

    public void setMessage( String Message ) {
        this.Message = Message;
    }
}