package Problem2;
public class Demo {
    public static void main(String[] args) {
        Point p1 = new Point(2.0f, 3.5f);
        System.out.println("Point p1: " + p1);

        MovablePoint mp1 = new MovablePoint(1.0f, 1.0f);
        System.out.println("MovablePoint mp1 before move: " + mp1);
        mp1.move();
        System.out.println("MovablePoint mp1 after move: " + mp1);

        MovablePoint mp2 = new MovablePoint(2.0f, 3.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint mp2 before move: " + mp2);
        mp2.move().move();
        System.out.println("MovablePoint mp2 after 2 moves: " + mp2);
    }
}
