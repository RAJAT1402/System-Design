package AbstractFactory.Factory;

import AbstractFactory.Pizza.MargeritaPizza;
import AbstractFactory.Pizza.Pizza;
import AbstractFactory.Pizza.PizzaType;
import AbstractFactory.Pizza.VeggiePizza;

public class DominosPizzaFactory extends PizzaFactory{
    
    @Override
    public Pizza getPizza(PizzaType pizza){
        return switch (pizza) {
            case Veggie -> new VeggiePizza();
            case Margerita -> new MargeritaPizza();
            default -> throw new IllegalArgumentException();
        };
    }
}
