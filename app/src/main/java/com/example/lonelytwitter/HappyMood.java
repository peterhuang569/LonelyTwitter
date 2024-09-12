package com.example.lonelytwitter;

import java.util.Date;

public class HappyMood extends Mood{
    public HappyMood (Date date) {
        super(date, "happy");
    }
    public HappyMood() {
        super("happy");
    }

    public String toString(){
        return date + " " + mood;
    }


}
