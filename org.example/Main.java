package org.example;

import org.example.classes.animals.Animal;
import org.example.classes.animals.Bird;
import org.example.classes.animals.Dog;
import org.example.classes.animals.Goldfish;
import org.example.classes.animals.Illness;
import org.example.interfaces.Goable;
import org.example.interfaces.Mathable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Шарик", LocalDate.of(2021, 04,15), new Illness("Лишай"));
        System.out.println(dog.getType());
        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(new Bird("Яша", LocalDate.of(2020,07,10), new Illness("Лишай"), 2));
        System.out.println(list);
        System.out.println("Домашнее задание: ");
        Animal goldfish = new Goldfish("Грек", LocalDate.of(2022,01,10), new Illness("аэромоноз"));
        Animal bird = new Bird("Гриша", LocalDate.of(2021,06,11), new Illness("Лишай"), 2);


        dog.toGo();
        bird.fly();
        goldfish.swim();
        dog.eat();
        bird.eat();
        goldfish.eat();

        List<Goable> goables = new ArrayList<>();
        goables.add(new Dog("Чел",LocalDate.of(2003, 11, 11), new Illness("Бешенство")));
        goables.add(new Bird("Лол",LocalDate.of(2002, 10, 10), new Illness("Бешенство"), 4));
        System.out.println(goables);
        for(Goable g : goables){
            System.out.println(g.go());
            g.defoultGo(10.5);
        }

        }
        Goable goable = new Goable() {
            @Override
            public double go() {
                return 0;
            }
        };
    Goable goable1 = ()-> 19;
    //Mathable m = new Mathable() {
    //    @Override
    //    public double addition(double a, double b) {
    //        return a + b;
    //     }
    // };
    // Mathable m2 =(x,y)->x+y;
    Mathable m = new Mathable() {
        @Override
        public double addition(double a, double b) {
            return 0;
        }

        @Override
        public double multiply(double a, double b) {
            return 0;
        }
    };

    }


