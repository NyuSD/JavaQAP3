public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            a = axis1;
            b = axis2;
        } else {
            a = axis2;
            b = axis1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        double aMinusB = a - b;
        double a2PlusB2 = (a * a) + (b * b);
        return Math.PI * Math.sqrt(2 * a2PlusB2 - (aMinusB * aMinusB) / 2.0);
    }
}
