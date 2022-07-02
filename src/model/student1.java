package model;

import java.util.ArrayList;

public class student1 extends Person {
    student1(ArrayList<Person> person) {
        super(person, 50, 70);
    }

    public void move() {
        int neww = getX();
        neww++;
        setX(neww);
    }

    public void isded() {
        setLive(false);
    }

    public void islive() {
        setLive(true);
    }

    public void fight(Person personFight) {
        int neww = personFight.getHealth();
        neww--;
        personFight.setHealth(neww);
    }
}

