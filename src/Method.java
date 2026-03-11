public class Method {
    static void greet() {
        System.out.println("Hello");
    }

    // Method with Parameter
    static void greetName(String name) {
        System.out.println("Hello " + name);
    }

    // Method with return value
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();

        greetName("Phyu");

        int result = add(3, 5);

        System.out.print(result);
    }
}
