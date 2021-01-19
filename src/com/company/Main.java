package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //First task
        Hero hero = new Hero(1000, 70, "Invisible");
        hero.getHeals();
        hero.getDamage();
        hero.getSuperPower();

        System.out.println("_________________");

        //Second Task
        Boss boss = new Boss();
        boss.setHeals(8500);
        boss.setDamage(250);
        boss.setDefenseType("Physical");
        System.out.println("Boss heals:" + boss.getHeals() + "\nBoss damage:" + boss.getDamage() + "\nBoss defence:" + boss.getDefenseType());

        //HW for quick wits
        for(Hero index : createHeroes()) {
            System.out.println(index);
        }
    }
    public static Hero[] createHeroes(){
        Hero Invoker = new Hero(640, 49, "Kinetic");
        Hero Tinker = new Hero(560, 53, "Physical");
        Hero ShadowFiend = new Hero(600, 32, "Magical");

        return new Hero[]{Invoker,Tinker,ShadowFiend};
    }
}