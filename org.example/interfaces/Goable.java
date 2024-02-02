package org.example.interfaces;
@FunctionalInterface
public interface Goable {
     double go();
     default void defoultGo(double speed){
         System.out.println(" Объект двигается со скоростью "+ speed);
     }
}
