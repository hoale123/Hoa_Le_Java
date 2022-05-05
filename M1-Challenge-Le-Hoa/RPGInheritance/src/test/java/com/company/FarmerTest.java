package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FarmerTest {
    Farmer farmer1;
    @Before
    public void setUp(){farmer1 = new Farmer();}

    @Test
    public void isRunning() {
        farmer1.isRunning();
        assertEquals(false,farmer1.isRunning());
    }

//    @Test
//    public void isPlowing() {
//    }
//
//    @Test
//    public void isHarvesting() {
//    }

}