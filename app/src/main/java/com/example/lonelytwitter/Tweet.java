package com.example.lonelytwitter;


import java.util.Date;

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

    public Tweet (String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString(){
        return message + " " + date;
    }

    public abstract Boolean isImportant();
}