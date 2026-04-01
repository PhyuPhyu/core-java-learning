public class ExceptionTest {
    public static void main(String[] args) {
        int b = 7;
        int c = 0;
        try {
            // int arr[] = { 1, 2, 3 };
            // System.out.println(arr[5]);
            int k = b / c;
        } catch (ArithmeticException ae) {
            System.out.println("I catched Arithmetic exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range");
        } finally {
            System.out.println("Execution completed");
        }
    }
}
