package org.example.classes.animals;

import java.time.LocalDate;

public class Goldfish extends Animal {
    public Goldfish(String name, LocalDate birthDay, Illness illness){
        super(name, birthDay, illness);

    }
    @Override
    public void fly(){}
    @Override
    public void toGo(){}
    @Override
    public void eat(){
        System.out.println(" заглатывает!");
    }
}