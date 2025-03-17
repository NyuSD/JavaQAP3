package Problem1;
public class Teacher extends Person {
    private String subject;
    private double salary;

    /**
     * Constructor
     * @param name person's name
     * @param age person's age
     * @param gender person's gender
     * @param subject subject taught by the teacher
     * @param salary teacher's annual salary
     */
    public Teacher(String name, int age, String gender,
                   String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", subject: " + subject
               + ", salary: " + salary;
    }
}
