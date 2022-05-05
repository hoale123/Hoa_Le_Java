package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FarmerTest {
    Farmer farmer1;
    Constable constable;
    @Before
    public void setUp(){farmer1 = new Farmer();}
    @Before
    public void setUpConstable(){constable = new Constable();}

    @Test
    public void defaultValuesFromInheritanceFarmer(){
        assertEquals("John",farmer1.name);
        assertEquals(75,farmer1.strength);
        assertEquals(100,farmer1.health);
        assertEquals(75,farmer1.stamina);
        assertEquals(10,farmer1.speed);
        assertEquals(1,farmer1.attackPower);
        assertEquals(false,farmer1.running);
        assertEquals(false,farmer1.arrested);
    }

    @Test
    public void constableAttacks(){
        System.out.println(farmer1.name+ " " + farmer1.attack + constable.getName());
        assertEquals("John attacks Hoa",farmer1.name+" "+ farmer1.attack + constable.getName());
    }

    @Test
    public void isPlowing() {
        farmer1.isPlowing();
        assertEquals(false,farmer1.isPlowing());
    }

    @Test
    public void isHarvesting() {
        farmer1.isHarvesting();
        assertEquals(false,farmer1.isHarvesting());
    }
}