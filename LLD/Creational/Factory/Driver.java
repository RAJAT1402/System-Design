package Factory;

public class Driver {
    public static void main(String[] args) {
        
        // tight coupling
        // if class is discountinued client has to change
        Pizza veggiePizza = new VeggiePizza();


        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza vPizza = pizzaFactory.getPizza(PizzaType.Veggie);
        System.out.println(vPizza.getName());

        Pizza mPizza = pizzaFactory.getPizza(PizzaType.Margerita);
        System.out.println(mPizza.getName());
    }
}
