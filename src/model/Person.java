package model;

import java.util.ArrayList;

public class Person {
   private int id ;
    private int health ;
    private int power ;
    private int x ;
    private int y ;
    private boolean live = false ;
Person(ArrayList<Person>person , int power , int health){
    this.id = person.size() ;
    this.power = power ;
    this.health = health ;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
