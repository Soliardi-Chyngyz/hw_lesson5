package com.company;

public class Main {
    public static void main(String[] args) {
        Boss bossDefeanse = new Boss();

        Boss boss = new Boss(1000, 100, "Magic");

        System.out.println(boss.getHealth() + " " + boss.getDamage() + " super power is " + boss.getDefense());

        createHeroes();

    }

    public static com.company.Hero[] createHeroes(){
        Hero[] heros = new Hero[3];

        Hero strikoza = new Hero ("strikoza", 400, "fly");
        heros[0] = strikoza;
//        int strikozaHealth = strikoza.getHealth();
//        System.out.println("strikoza " + strikoza.getHealth() + " " + strikoza.getSuperPower());

        Hero borsok = new Hero("borsok",500,40,"ожирение");
        heros[1] = borsok;
//        System.out.println("borsok " + borsok.getHealth() + " " + borsok.getSuperPower());

        Hero chypalak = new Hero("chypalak", 400, 30, "разгибается");
        heros[2] = chypalak;
//        System.out.println("chypalak " + " " + chypalak.getHealth() + " " + chypalak.getDamage() + " " + chypalak.getSuperPower());

        for (int i = 0; i < 3; i++) {
            System.out.print(heros[i].getName() + " - " + heros[i].getHealth() + " " + heros[i].getDamage() + " " + heros[i].getSuperPower() + " | ");
        }
        return heros;
    }
}
