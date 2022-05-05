package com.company;

public class ConverterIf implements Converter{

    @Override
    public String convertMonth(int monthNumber) {
        String monthString;
        if (monthNumber == 1){
             monthString = "January";
        } else if (monthNumber == 2) {
            monthString = "February";

        }else if (monthNumber == 3) {
            monthString = "March";

        }else if (monthNumber == 4) {
            monthString = "April";

        }else if (monthNumber == 5) {
            monthString = "May";

        }else if (monthNumber == 6) {
            monthString = "June";

        }else if (monthNumber == 7) {
            monthString = "July";

        }else if (monthNumber == 8) {
            monthString = "August";

        }else if (monthNumber == 9) {
            monthString = "September";

        }else if (monthNumber == 10) {
            monthString = "October";

        }else if (monthNumber == 11) {
            monthString = "November";

        }else if (monthNumber == 12) {
            monthString = "December";

        }else {
            monthString = "Invalid Number";

        }
        return monthString;
    }

    @Override
    public String convertDay(int dayNumber) {
        String dayString;
        if (dayNumber == 1) {
//            System.out.println("Sunday");
            dayString = "Sunday";
        } else if (dayNumber == 2) {
//            System.out.println("Monday");
            dayString = "Monday";
        } else if (dayNumber == 3) {
//            System.out.println("Tuesday");
            dayString = "Tuesday";
        } else if (dayNumber == 4) {
//            System.out.println("Wednesday");
            dayString = "Wednesday";
        } else if (dayNumber == 5) {
//            System.out.println("Thursday");
            dayString = "Thursday";
        } else if (dayNumber == 6) {
//            System.out.println("Friday");
            dayString = "Friday";
        } else if (dayNumber == 7) {
//            System.out.println("Saturday");
            dayString = "Saturday";
        } else {
//            System.out.println("Invalid Input.");
            dayString = "Invalid Input.";
        }
        return dayString;
    }
}
