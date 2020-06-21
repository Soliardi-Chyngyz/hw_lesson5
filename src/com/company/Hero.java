package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero(int hlth, int dam, String supPower){
        this.health = hlth;
        this.damage = dam;
        this.superPower = supPower;
    }

    public Hero(int hlth, String supPower){
        this.health = hlth;
        this.superPower = supPower;
    }

    public int getHealth() {return health;}
    public int getDamage() {return damage;}
    public String getSuperPower() {return superPower;}
}
