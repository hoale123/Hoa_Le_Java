package com.company;

public abstract class Humans {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;
    protected boolean running;
    protected boolean arrested;

    protected String attack;


//    public Humans() {
//
//    }

    public String getName() {
        return name;
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

}
