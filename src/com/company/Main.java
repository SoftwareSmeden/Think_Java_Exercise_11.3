package com.company;

public class Main {

    public static void main(String[] args) {
        // Think Java - Exercise 11.3

        int year = 1992;
        int month = 7;
        int day = 19;

        // Using the constructor that takes three parameters.
        Date birthday = new Date(year, month, day);
        System.out.println(birthday);

        // Using the default constructor. The one without any parameters.
        Date birthdaySecond = new Date();
        System.out.println(birthdaySecond);


    }

}
