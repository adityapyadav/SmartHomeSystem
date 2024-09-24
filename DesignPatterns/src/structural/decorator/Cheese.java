package structural.decorator;

public class Cheese extends PizzaDecorator {
    
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + " + Cheese";
    }
}
