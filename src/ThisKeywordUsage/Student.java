package ThisKeywordUsage;

public class Student {
    String name;

    Student() {
        System.out.println("Default constructor");
    }

    Student(String name) {
        this();

        System.out.println("Parameterized constructor: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student("Phyu");
    }
}
