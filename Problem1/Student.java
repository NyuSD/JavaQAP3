package Problem1;
public class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    /**
     * Constructor
     * @param name person's name
     * @param age person's age
     * @param gender person's gender
     * @param idNum student ID number
     * @param gpa student's GPA
     */
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setters
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    public String toString() {
        return super.toString() + ", student ID: " + myIdNum
               + ", GPA: " + myGPA;
    }
}
