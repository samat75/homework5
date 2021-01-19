package com.company;

public class Hero {
    private int heals;
    private int damage;
    private String superPower;

    public Hero() {
    }

    public Hero(int heals, int damage, String superPower) {
        this.heals = heals;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int heals, int damage) {
        this.heals = heals;
        this.damage = damage;
    }

    public int getHeals() {
        return heals;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setHeals(int heals) {
        this.heals = heals;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String toString() {
        return "Heals:" + heals + " Damage:" + damage + " Defense:" + superPower + "";
    }
}
