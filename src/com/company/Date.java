package com.company;

public class Date {

    private int year;
    private int month;
    private int day;

    Date(){

        // Default constructor with default values.
        this.year = 1;
        this.month = 1;
        this.day = 1;

    }

    Date(int year, int month, int day){

        // This constructor is used when the object "Date" got
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public String toString() {

        // toString method is used for "override" to prevent the "sout" for displaying the address for the object.
        return "Day: " + day + " Month: " + month + " Year: " + year;

    }
}


