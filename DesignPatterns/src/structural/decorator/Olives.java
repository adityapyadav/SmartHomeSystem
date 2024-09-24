package structural.decorator;

public class Olives extends PizzaDecorator {
    
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " + Olives";
    }
}
