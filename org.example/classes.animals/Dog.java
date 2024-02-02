package org.example.classes.animals;

import org.example.interfaces.Goable;
import org.example.interfaces.Huntable;

import java.time.LocalDate;

public class Dog extends Animal implements Huntable, Goable {
    public Dog(String name, LocalDate birthDay, Illness illness){
        super(name, birthDay, illness);

    }
    @Override
    public void swim(){}
    @Override
    public void fly(){}
    @Override
    public void eat(){
        System.out.println(" чавкает!");
    }
    @Override
    public double go() {
        return 6;
    }
}