package AbstractFactory.Factory;

import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Pizza.PizzaType;

public abstract class PizzaFactory {
    
    public abstract Pizza getPizza(PizzaType Pizza);
}
