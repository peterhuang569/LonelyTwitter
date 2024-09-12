package com.example.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    protected Date date;
    protected String mood;

    public Mood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    public Mood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }
}
