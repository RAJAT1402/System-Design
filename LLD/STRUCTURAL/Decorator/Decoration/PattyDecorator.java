package Decorator.Decoration;

import Decorator.Burger;

public class PattyDecorator extends BurgerDecorator{
    
    public PattyDecorator(Burger burger){
        super(burger);
    }

    @Override
    public String getDescription(){
        return "Patty " + this.burger.getDescription();
    }

    @Override
    public Double getCost(){
        return 3.0 + this.burger.getCost();
    }
}
