package structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza plainPizza = new PlainPizza();
        System.out.println(plainPizza.makePizza());
        
        Pizza cheesePizza = new Cheese(plainPizza);
        System.out.println(cheesePizza.makePizza());

        Pizza olivesCheesePizza = new Olives(cheesePizza);
        System.out.println(olivesCheesePizza.makePizza());
    }
}
