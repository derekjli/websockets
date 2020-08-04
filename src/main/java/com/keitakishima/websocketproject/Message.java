package com.keitakishima.websocketproject;

public class Message {

    private String from;
    private String text;

    public Message(String from, String text) {
        this.from  = from;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getFrom() {
        return from;
    }

    // getters and setters
};


//By default, Spring will use the Jackson library to convert our model object to and from JSON.

