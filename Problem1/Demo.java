package Problem1;

public class Demo {
    public static void main(String[] args) {
        Person bob = new Person("John Bob", 32, "M");
        System.out.println(bob);

        Student sam = new Student("Sam Bob", 36, "F", "HS54129", 4.5);
        System.out.println(sam);

        Teacher bobBob = new Teacher("Bob Bob", 38, "M", "Computer Science", 2);
        System.out.println(bobBob);

        CollegeStudent ima = new CollegeStudent("Ima Bob", 22, "F", 
                                                "UCB323", 4.2, 2, "English");
        System.out.println(ima);
    }
}
