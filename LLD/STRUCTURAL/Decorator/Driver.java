package Decorator;

import Decorator.Decoration.KetchupDecorator;
import Decorator.Decoration.PattyDecorator;

public class Driver {
    public static void main(String[] args) {
        
        Burger burger = new PlainBurger();

        System.out.println(burger.getDescription() + " " + burger.getCost());

        burger = new PattyDecorator(burger);

        System.out.println(burger.getDescription() + " " + burger.getCost());

        burger = new KetchupDecorator(burger);

        System.out.println(burger.getDescription() + " " + burger.getCost());
    }
}
