package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {
    Warrior warrior;
    Farmer farmer;
    @Before
    public void setUp(){warrior = new Warrior();}

    @Before
    public void setFarmer(){farmer = new Farmer();}

    @Test
    public void defaultValuesFromInheritanceWarrior(){
        assertEquals("Tim",warrior.name);
        assertEquals(75,warrior.strength);
        assertEquals(100,warrior.health);
        assertEquals(100,warrior.stamina);
        assertEquals(50,warrior.speed);
        assertEquals(10,warrior.attackPower);
        assertEquals(false,warrior.isRunning());
        assertEquals(false,warrior.isArrested());
    }
    @Test
    public void warriorAttacks(){
        System.out.println(warrior.name+ " " + warrior.attack + farmer.getName());
        assertEquals("Tim attacks John",warrior.name+" "+ warrior.attack + farmer.getName());
    }
    @Test
    public void warriorShieldPower() {
        warrior.getShieldStrength();
        assertEquals(100,warrior.getShieldStrength());
    }

}
