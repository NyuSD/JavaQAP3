package Problem1;
public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    /**
     * Constructor
     * @param name person's name
     * @param age person's age
     * @param gender person's gender
     */
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getters
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setters
    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
