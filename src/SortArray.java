import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = { 10, 1, 12, 3, 9 };
        int temp = 0;

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}
