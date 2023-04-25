package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Box 1 perimeter: " + box1.getPerimeter());
        System.out.println("Box 1 area: " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Box 2 perimeter: " + box2.getPerimeter());
        System.out.println("Box 2 area: " + box2.getArea());
    }
}
