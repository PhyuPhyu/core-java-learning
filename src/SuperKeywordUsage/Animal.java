package SuperKeywordUsage;

public class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }

    String name = "Animal";

    void sound() {
        System.out.println("Animal makes sound");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.printName();
        d.display();
    }
}
