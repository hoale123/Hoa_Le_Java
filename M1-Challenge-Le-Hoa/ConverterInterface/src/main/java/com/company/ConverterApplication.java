package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        System.out.println("ConverterIF");
        System.out.println("============ Months ================");
        //instantiate
        ConverterIf converterIf = new ConverterIf();
        int myMonthNumber = 1;
        String myMonth = converterIf.convertMonth(myMonthNumber);
        System.out.println(myMonth +" is "+ "Month " + myMonthNumber);
        System.out.println("=========== Days =================");
        int myDayNumber = 1;
        String myDay = converterIf.convertDay(myDayNumber);
        System.out.println(myDay +" is "+ "Day " + myDayNumber);

        System.out.println("============================");

        System.out.println("ConverterSwitch statement");
        System.out.println("============= Months ===============");

        ConverterSwitch converterSwitch = new ConverterSwitch();
        int myMonthNumberSwitch = 1;
        String myMonthSwitch = converterSwitch.convertMonth(myMonthNumberSwitch);
        System.out.println(myMonthSwitch +" is "+ "Month " + myMonthNumberSwitch);

        System.out.println("============= Days ===============");
        int myDayNumberSwitch = 1;
        String myDaySwitch = converterSwitch.convertDay(myDayNumberSwitch);
        System.out.println(myDaySwitch +" is " + "Day "+ myDayNumberSwitch);


    }
}
