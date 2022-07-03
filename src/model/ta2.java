package model;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class ta2 extends Person {
    Image image = new Image("@../image/z2.png");

    ta2(ArrayList<Person> person) {
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
