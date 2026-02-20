package AbstractFactory.Factory;

import AbstractFactory.Pizza.DoubleCheeseMargeritaPizza;
import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Pizza.PizzaType;
import AbstractFactory.Pizza.VeggieParadisePizza;

public class PizzaHutFactory extends PizzaFactory{
    
    @Override
    public Pizza getPizza(PizzaType pizza){
        return switch (pizza) {
            case Veggie -> new VeggieParadisePizza();
            case Margerita -> new DoubleCheeseMargeritaPizza();
            default -> throw new IllegalArgumentException();
        };
    }
}
