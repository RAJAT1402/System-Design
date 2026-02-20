package AbstractFactory;

import AbstractFactory.Factory.PizzaFactory;
import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Pizza.PizzaType;

public class Driver {
    public static void main(String[] args) {
        
        FactoryProvider factoryProvider = new FactoryProvider();

        PizzaFactory dominos = factoryProvider.getPizzaFactory(PizzaFactoryType.DOMIOS);

        PizzaFactory pizzaHut = factoryProvider.getPizzaFactory(PizzaFactoryType.PIZZA_HUT);

        Pizza p1 = dominos.getPizza(PizzaType.Veggie);
        Pizza p2 = dominos.getPizza(PizzaType.Margerita);
        Pizza p3 = pizzaHut.getPizza(PizzaType.Veggie);
        Pizza p4 = pizzaHut.getPizza(PizzaType.Margerita);

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(p4.getName());
    }
}
