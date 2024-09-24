package creational.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        // Get a Circle object and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        // Get a Square object and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
