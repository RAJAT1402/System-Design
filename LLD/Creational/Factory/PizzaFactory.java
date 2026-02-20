package Factory;

public class PizzaFactory {
    
    public Pizza getPizza(PizzaType pizza){
        // switch (pizza) {
        //     case Veggie : return new VeggiePizza();
            
        //     case Margerita : return new MargeritaPizza();
        
        //     default: throw new IllegalArgumentException();
        // }

        return switch (pizza) {
            case Veggie -> new VeggiePizza();
            case Margerita -> new MargeritaPizza();
            default -> throw new IllegalArgumentException();
        };
    }
}
