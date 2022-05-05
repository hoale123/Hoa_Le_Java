package com.company;

public class Constable extends Humans{
//    private int health = 100;
//    private int stamina = 60;
//    private int speed = 20;
//    private int attackPower = 5;
//
//    private boolean running = false;
    private String arrest;
    private String jurisdiction; //Location

    //default because it inherit from human
    public Constable() {
        this.name = "Hoa";
        this.strength = 60;
        this.health = 100;
        this.stamina = 60;
        this.speed = 20;
        this.attackPower = 5;
        this.running = false;
        this.arrested = false;
        this.arrest = "arrests ";
        this.jurisdiction = "Atlanta";
        this.attack = "attacks ";
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public String toString() {
        return "Constable{" +
                "strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                ", jurisdiction='" + jurisdiction + '\'' +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", arrest=" + arrest +
                '}';
    }
}
