public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello World";
        String newString = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            // System.out.println(s.charAt(i));
            newString += s.charAt(i);
        }

        System.out.println(newString);
    }
}
