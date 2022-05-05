package com.company;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class Application {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        System.out.println(farmer1.isRunning());
        farmer1.setName("John");
        System.out.println(farmer1.name);
        System.out.println("Attack Power = " + farmer1.getAttackPower());

        System.out.println("============");
        Constable constable1 = new Constable();
        System.out.println(constable1.getName());
        System.out.println("Attack Power = " + constable1.getAttackPower());

        System.out.println("============");
        Warrior warrior1 = new Warrior();
        System.out.println(warrior1.getName());
        System.out.println("Attack Power = " + warrior1.getAttackPower());
        System.out.println(warrior1.name+" " + warrior1.attack + farmer1.name);


    }
}
