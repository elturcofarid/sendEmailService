package com.util.email.model;

public class Attachment {
    public String Name;
    public String Content;
    public String ContentType;


    // Getter Methods

    public String getName() {
        return Name;
    }

    public String getContent() {
        return Content;
    }

    public String getContentType() {
        return ContentType;
    }

    // Setter Methods

    public void setName( String Name ) {
        this.Name = Name;
    }

    public void setContent( String Content ) {
        this.Content = Content;
    }

    public void setContentType( String ContentType ) {
        this.ContentType = ContentType;
    }
}