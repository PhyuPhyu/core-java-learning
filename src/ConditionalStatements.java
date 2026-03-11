public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 29;

        // if statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        }
        // if-else statement
        if (age >= 30) {
            System.out.println("Adult");
        } else {
            System.out.println("minor");
        }

        int mark = 49;

        // if-else if-else Statement
        if (mark >= 90) {
            System.out.println("Grade A");
        } else if (mark >= 70) {
            System.out.println("Grade B");
        } else if (mark >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("fail");
        }

        int day = 4;

        // switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Ternary Operator (Short if-else)
        String result = (age >= 18) ? "Adult" : "minor";
        System.out.println(result);

        String markResult = (mark >= 90) ? "D" : "F";
        System.out.println(markResult);
    }
}
