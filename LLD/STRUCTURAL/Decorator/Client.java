package Decorator;

public class Client {
    
    public Burger create(){
        return new PlainBurger();
    }

    public Burger addDecoration(final Burger burger, String decoration){

        // get a decorator object using factory
        // add burger to it 
        // return the new burger
        return null;
    }
}
