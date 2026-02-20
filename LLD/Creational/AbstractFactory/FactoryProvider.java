package AbstractFactory;

import AbstractFactory.Factory.DominosPizzaFactory;
import AbstractFactory.Factory.PizzaFactory;
import AbstractFactory.Factory.PizzaHutFactory;

public class FactoryProvider {
    
    public PizzaFactory getPizzaFactory(PizzaFactoryType type){

        return switch(type){
            case DOMIOS -> new DominosPizzaFactory();
            case PIZZA_HUT -> new PizzaHutFactory();
            default -> throw new IllegalArgumentException();
        };
    }
}
