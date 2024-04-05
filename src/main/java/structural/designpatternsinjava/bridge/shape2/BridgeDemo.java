package structural.designpatternsinjava.bridge.shape2;

public class BridgeDemo {

    public static void main(String[] args) {
        Color blue = new Blue();

        Shape sqaure = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Color green = new Green();

        Shape greenCircle = new Circle(green);

        sqaure.applyColor();
        circle.applyColor();
        greenCircle.applyColor();

        Shape greenSquare = new Square(green);
        greenSquare.applyColor();
    }
}
