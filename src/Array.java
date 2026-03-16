public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;

        System.out.println("Array " + numbers.length);
        numbers[4] = 6;
        System.out.println(numbers[4]);

        String[] months = { "jan", "feb", "march", "april", "may" };
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        String[] users = { "admin", "tester", "guest" };
        for (String user : users) {
            System.out.println("user " + user);
        }

    }
}
