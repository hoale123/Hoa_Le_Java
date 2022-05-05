package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {

    private ConverterIf converterIf;
    @Before
    public void runBeforeEachIndividualTest(){
        converterIf = new ConverterIf();
    }
    @Test
    public void convertMonth() {
        assertEquals("January",converterIf.convertMonth(1));
        assertEquals("February",converterIf.convertMonth(2));
//        assertEquals("February",converterIf.convertMonth(3));
    }

    @Test
    public void convertDay() {
        assertEquals("Sunday",converterIf.convertDay(1));
        assertEquals("Monday",converterIf.convertDay(2));
//        assertEquals("February",converterIf.convertMonth(3));
    }
}