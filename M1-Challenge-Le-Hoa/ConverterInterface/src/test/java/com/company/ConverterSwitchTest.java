package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {

    private ConverterSwitch converterSwitch;
    @Before
    public void runBeforeEachIndividualTest(){
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void convertToMonth() {
        assertEquals("January",converterSwitch.convertMonth(1));
        assertEquals("February",converterSwitch.convertMonth(2));
//        assertEquals("February",converterSwitch.convertMonth(3));
    }

    @Test
    public void convertToDay() {
        assertEquals("Sunday",converterSwitch.convertDay(1));
        assertEquals("Monday",converterSwitch.convertDay(2));
        //        assertEquals("Thursday",converterSwitch.convertMonth(3));

    }
}