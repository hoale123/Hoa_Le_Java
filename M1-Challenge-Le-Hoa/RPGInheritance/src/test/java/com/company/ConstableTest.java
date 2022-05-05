package com.company;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ConstableTest {

    Constable constable;
    Farmer farmer;
    @Before
    public void setUp(){
        constable = new Constable();
    }
    @Before
    public void setUpFarmer(){
        farmer = new Farmer();
    }

    @Test
    public void defaultValuesFromInheritanceConstable(){
    assertEquals("Hoa",constable.name);
    assertEquals(60,constable.strength);
    assertEquals(100,constable.health);
    assertEquals(60,constable.stamina);
    assertEquals(20,constable.speed);
    assertEquals(5,constable.attackPower);
    assertEquals(false,constable.running);
    assertEquals(false,constable.arrested);
    }
    @Test
    public void constableAttacks(){
        System.out.println(constable.name+ " " + constable.attack + farmer.getName());
        assertEquals("Hoa attacks John",constable.name+" "+ constable.attack + farmer.getName());
    }
    @Test
    public void constableArrest(){
        System.out.println(constable.name+ " " + constable.getArrest() + farmer.getName());
        assertEquals("Hoa arrests John",constable.name+" "+ constable.getArrest() + farmer.getName());
    }

    @Test
    public void constableJurisdiction(){
        System.out.println(constable.name+ "'s location: " + constable.getJurisdiction() );
        assertEquals("Hoa's location: Atlanta",constable.name+ "'s location: " + constable.getJurisdiction());
    }
}
