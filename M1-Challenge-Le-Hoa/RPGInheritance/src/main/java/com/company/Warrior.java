package com.company;

import java.util.Objects;

public class Warrior extends Humans {


    private int shieldStrength;
    private boolean running;
    private boolean arrested;

    public Warrior() {
        this.name = "Tim";
        this.strength = 75;
        this.health = 100;
        this.stamina = 100;
        this.speed = 50;
        this.attackPower = 10;
        this.shieldStrength = 100;
        this.running = false;
        this.arrested = false;
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

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
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

    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                ", running=" + running +
                ", arrested=" + arrested +
                ", name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                ", attack='" + attack + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength && running == warrior.running && arrested == warrior.arrested;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shieldStrength, running, arrested);
    }
}
