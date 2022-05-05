package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {
    Warrior warrior;
    @Before
    public void setUp(){warrior = new Warrior();}

    @Test
    public void isRunning() {
        warrior.isRunning();
        assertEquals(false,warrior.isRunning());
    }

//    @Test
//    public void isPlowing() {
//    }
//
//    @Test
//    public void isHarvesting() {
//    }
}
