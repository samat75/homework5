package com.company;

public class Boss {
    private int heals;
    private int damage;
    private String defenseType;

    public Boss(){}

    public Boss(int heals,int damage,String defenseType){
        this.heals=heals;
        this.damage=damage;
        this.defenseType=defenseType;
    }

    public int getHeals() {
        return heals;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setHeals(int heals) {
        if(heals<0){
            System.out.println("Wrong value");
        }
        else {
            this.heals = heals;
        }
    }

    public void setDamage(int damage) {
        if(damage<0){
            System.out.println("Wrong value");
        }
        else {
            this.damage = damage;
        }
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }
}