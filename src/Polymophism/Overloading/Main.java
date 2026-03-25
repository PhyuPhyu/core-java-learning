package Polymophism.Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator mo = new Calculator();

        System.out.println(mo.add(20, 20));
        System.out.println(mo.add(303, 10, 30));
        System.out.println(mo.add(99.99, 1000.00));
    }
}
