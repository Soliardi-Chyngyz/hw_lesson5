package com.company;

public class Main {

    public static void main(String[] args) {
        Boss bossDefeanse = new Boss();

        Boss boss = new Boss(1000, 100, "Magic");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " super power is " + boss.getDefense());

        createHeroes();



    }

    public static int createHeroes(){
        Hero[] heros = new Hero[3];

        Hero strikoza = new Hero (400, "fly");
        heros[0] = strikoza;
        int strikozaHealth = strikoza.getHealth();
        System.out.println("strikoza " + strikoza.getHealth() + " " + strikoza.getSuperPower());
//        return strikoza;

        Hero borsok = new Hero(500,40,"ожирение");
        heros[1] = borsok;
        System.out.println("borsok " + borsok.getHealth() + " " + borsok.getSuperPower());

        Hero chypalak = new Hero(400, 30, "разгибается");
        heros[2] = chypalak;
        System.out.println("chypalak " + " " + chypalak.getHealth() + " " + chypalak.getDamage() + " " + chypalak.getSuperPower());

        for (int i = 0; i < heros.length; i++) {
//            System.out.println("i " + i.getHealth() +);
        }
        return createHeroes();
    }
}
