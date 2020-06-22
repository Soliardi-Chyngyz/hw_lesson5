package com.company;

public class Hero {
    private String name;
    private int health;
    private int damage;
    private String superPower;

    public Hero(String name, int hlth, int dam, String supPower){
        this.name = name;
        this.health = hlth;
        this.damage = dam;
        this.superPower = supPower;
    }

    public Hero(String name, int hlth, String supPower){
        this.name = name;
        this.health = hlth;
        this.superPower = supPower;
    }

    public String getName() {return name;}
    public int getHealth() {return health;}
    public int getDamage() {return damage;}
    public String getSuperPower() {return superPower;}
}
