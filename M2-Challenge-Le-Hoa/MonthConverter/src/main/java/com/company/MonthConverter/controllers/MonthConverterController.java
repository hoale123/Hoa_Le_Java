package com.company.MonthConverter.controllers;

import com.company.MonthConverter.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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


    @RequestMapping(value = "/month/{number}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getMonth(@PathVariable String number) {
        switch (number) {
            case "1" :
                return "January";
            case "2" :
                return "February";
            case "3" :
                return "March";
            case "4" :
                return "April";
            case "5" :
                return "May";
            case "6" :
                return "June";
            case "7" :
                return "July";
            case "8" :
                return "August";
            case "9" :
                return "September";
            case "10" :
                return "October";
            case "11" :
                return "November";
            case "12" :
                return "December";
            default:
                throw new ResponseStatusException(HttpStatus.FORBIDDEN, "invalid month");
        }
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