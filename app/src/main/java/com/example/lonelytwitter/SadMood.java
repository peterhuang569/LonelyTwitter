package com.example.lonelytwitter;

import java.util.Date;

public class SadMood extends Mood{
    public SadMood (Date date) {
        super(date, "sad");
    }

    public SadMood() {
        super("sad");
    }

    public String toString() {
        return date + " " + mood;
    }
}
