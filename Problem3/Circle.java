public class Circle extends Ellipse {
    public Circle(String name, double radius) {
        // Pass radius twice to Ellipse
        super(name, radius, radius);
    }
}
