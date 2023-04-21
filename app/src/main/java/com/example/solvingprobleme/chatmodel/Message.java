package com.example.solvingprobleme.chatmodel;

public class Message {

    public static String SEND_BY_ME = "me";
    public static String SEND_BY_BOT = "bot";

  public   String message;
    public String sentBy;

    public Message(String message, String sentBy) {
        this.message = message;
        this.sentBy = sentBy;
    }


    public Message() {
    }


    public static String getSendByMe() {
        return SEND_BY_ME;
    }

    public static void setSendByMe(String sendByMe) {
        SEND_BY_ME = sendByMe;
    }

    public static String getSendByBot() {
        return SEND_BY_BOT;
    }

    public static void setSendByBot(String sendByBot) {
        SEND_BY_BOT = sendByBot;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
}


