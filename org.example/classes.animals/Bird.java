package org.example.classes.animals;

import org.example.interfaces.Goable;

import java.time.LocalDate;

public class Bird extends Animal implements Goable {
    private int wingQuantity;

    public Bird(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;

    }

    @Override
    public void swim() {
    }

    @Override
    public void eat() {
        System.out.println(" клюёт!");
    }

    @Override
    public double go() {
        return 2;
    }
}