public class PalindromeCheckTwo {
    public static void main(String[] args) {
        String str = "madam";
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        // if (str.equals(reverseStr)) {
        // System.out.println("Palindrome");
        // }

        System.out.println(str.equals(reverseStr) ? "Palindrome" : "Not Palindrome");
    }
}
