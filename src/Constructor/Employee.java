package Constructor;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;

        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee e = new Employee("phyu");
    }
}
