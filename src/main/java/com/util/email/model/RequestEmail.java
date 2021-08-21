package com.util.email.model;

import java.util.ArrayList;

public class RequestEmail {

        private String From;
        private String To;
        private String Subject;
        private String Tag;
        private String HtmlBody;
        private String TextBody;
        private String ReplyTo;
        ArrayList<Object> Headers = new ArrayList<Object>();
        private boolean TrackOpens;
        private String TrackLinks;
        ArrayList<Object> Attachments = new ArrayList<Object>();
        private String MessageStream;


        // Getter Methods

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
                '}';
    }
}





