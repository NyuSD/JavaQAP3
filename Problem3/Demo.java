public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle("MyCircle", 5.0);
        Shape ellipse = new Ellipse("MyEllipse", 4.0, 2.0);
        Shape triangle = new Triangle("MyTriangle", 3.0, 4.0, 5.0);
        Shape equiTri = new EquilateralTriangle("MyEquilateral", 6.0);

        Shape[] shapes = { circle, ellipse, triangle, equiTri };

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
