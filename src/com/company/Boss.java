package com.company;

public class Boss {
    private int health;
    private int damage;
    private String defense;

    public Boss(int hth, int dam, String def) {
        this.health = hth;
        this.damage = dam;
        this.defense = def;
    }
    public Boss(){}

    public int getHealth() {
        health = 2000;
        return health;
    }
    public void setHealth(int health){
        System.out.println("вызвал сетер");
        this.health = health;}

    public int getDamage() {
        damage = 100;
        return damage;
    }
    public void setDamage(int damage){
        System.out.println("вызвал сетер");
        this.damage = damage;}

    public String getDefense() {
        defense = "Stalker";
        return defense;
    }
    public void setDefense(String defense){
        System.out.println("вызвал сетер");
        this.defense = defense;}
}
