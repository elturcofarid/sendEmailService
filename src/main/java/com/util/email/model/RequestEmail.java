package com.util.email.model;


import java.util.ArrayList;

public class RequestEmail {

        public String From;
    public String To;
    public String Subject;
    public String Tag;
    public String HtmlBody;
    public String TextBody;
    public String ReplyTo;
        ArrayList<Object> Headers = new ArrayList<Object>();
    public boolean TrackOpens;
    public String TrackLinks;
    public ArrayList<Attachment> Attachments = new ArrayList<Attachment>();
    public String MessageStream;

    public Object data;
    public String APiToken;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getAPiToken() {
        return APiToken;
    }

    public void setAPiToken(String APiToken) {
        this.APiToken = APiToken;
    }

    public ArrayList<Attachment> getAttachments() {
        return Attachments;
    }

    public void setAttachments(ArrayList<Attachment> attachments) {
        Attachments = attachments;
    }

    public String getFrom() {
            return From;
        }

        public String getTo() {
            return To;
        }

        public String getSubject() {
            return Subject;
        }

        public String getTag() {
            return Tag;
        }

        public String getHtmlBody() {
            return HtmlBody;
        }

        public String getTextBody() {
            return TextBody;
        }

        public String getReplyTo() {
            return ReplyTo;
        }

        public boolean getTrackOpens() {
            return TrackOpens;
        }

        public String getTrackLinks() {
            return TrackLinks;
        }



        public String getMessageStream() {
            return MessageStream;
        }

        // Setter Methods

        public void setFrom( String From ) {
            this.From = From;
        }

        public void setTo( String To ) {
            this.To = To;
        }

        public void setSubject( String Subject ) {
            this.Subject = Subject;
        }

        public void setTag( String Tag ) {
            this.Tag = Tag;
        }

        public void setHtmlBody( String HtmlBody ) {
            this.HtmlBody = HtmlBody;
        }

        public void setTextBody( String TextBody ) {
            this.TextBody = TextBody;
        }

        public void setReplyTo( String ReplyTo ) {
            this.ReplyTo = ReplyTo;
        }

        public void setTrackOpens( boolean TrackOpens ) {
            this.TrackOpens = TrackOpens;
        }

        public void setTrackLinks( String TrackLinks ) {
            this.TrackLinks = TrackLinks;
        }



        public void setMessageStream( String MessageStream ) {
            this.MessageStream = MessageStream;
        }


    @Override
    public String toString() {
        return "RequestEmail{" +
                "From='" + From + '\'' +
                ", To='" + To + '\'' +
                ", Subject='" + Subject + '\'' +
                ", Tag='" + Tag + '\'' +
                ", HtmlBody='" + HtmlBody + '\'' +
                ", TextBody='" + TextBody + '\'' +
                ", ReplyTo='" + ReplyTo + '\'' +
                ", Headers=" + Headers +
                ", TrackOpens=" + TrackOpens +
                ", TrackLinks='" + TrackLinks + '\'' +
                ", Attachments=" + Attachments +
                ", MessageStream='" + MessageStream + '\'' +
                ", data=" + data +
                ", APiToken='" + APiToken + '\'' +
                '}';
    }
}





