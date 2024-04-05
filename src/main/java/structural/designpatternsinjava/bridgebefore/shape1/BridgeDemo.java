package structural.designpatternsinjava.bridgebefore.shape1;

public class BridgeDemo {

    public static void main(String[] args) {
        Circle circle = new BlueCircle();

        Sqaure sqaure = new RedSquare();

        circle.applyColor();
        sqaure.applyColor();
    }
}
