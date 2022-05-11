package com.company.MonthConverter.controllers;

import com.company.MonthConverter.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class MonthConverterController {

    private static Month[] months ={
            new Month(1,"January"),
            new Month(2,"February"),
            new Month(3,"March"),
            new Month(4,"April"),
            new Month(5,"May"),
            new Month(6,"June"),
            new Month(7,"July"),
            new Month(8,"August"),
            new Month(9,"September"),
            new Month(10,"October"),
            new Month(11,"November"),
            new Month(12,"December"),

};


    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthById(@PathVariable int monthNumber) {
        Month monthByNumbers = null;

        for(Month month : months) {
            if(month.getNumber() == monthNumber) {
                monthByNumbers = month;
                break;
            }
        }

        if (monthNumber<1 || monthNumber >12) {
            throw new IllegalArgumentException("Please enter a number from 1-12");
        }

        return months[monthByNumbers.getNumber()-1];
    }

    @RequestMapping(value="/randomMonth", method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Month getAnswer() {

        // Random number generator
        Random rand = new Random();
        // this makes one from 0 to 12
        int randomInt = rand.nextInt(12);
        int correctInt = randomInt;
        System.out.println(correctInt);

        return months[correctInt];
    }
}