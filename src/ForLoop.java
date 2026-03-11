public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Sum of numbers
        int sum = 0;

        for (int i = 0; i < 10; i += 2) {
            sum += i;
        }

        System.out.println(sum);

        // Reverse loop
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        // for loop with array
        int[] numbers = { 11, 14, 16, 18 };

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // enhance for loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
