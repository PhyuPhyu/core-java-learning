package SuperKeywordUsage;

public class Dog extends Animal {
    Dog() {
        super();

        System.out.println("Dog Constructor");
    }

    String name = "Dog";

    void printName() {
        System.out.println(name);
        System.out.println(super.name);
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        sound();
        super.sound();
    }
}
