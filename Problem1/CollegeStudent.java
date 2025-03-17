package Problem1;
public class CollegeStudent extends Student {
    private String major;
    private int year;

    /**
     * Constructor
     * @param name person's name
     * @param age person's age
     * @param gender person's gender
     * @param idNum student ID
     * @param gpa student's GPA
     * @param year current level in college (1=Frosh,2=Soph,...)
     * @param major student's major
     */
    public CollegeStudent(String name, int age, String gender,
                          String idNum, double gpa,
                          int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getters
    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return super.toString() + ", year: " + year
               + ", major: " + major;
    }
}
