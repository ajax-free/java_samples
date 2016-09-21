package ru.techcoll.core;

public class Unit {

    private int attack;

    private int health;

    public Unit() {
        this(0, 0);
    }

    public Unit(int attack, int health) {
        this.attack = attack;
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
