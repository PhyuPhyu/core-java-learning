public class StringUsageTwo {
    public static void main(String[] args) {
        String a = "hello";
        String b = a;

        a = "world";
        System.out.println(a);
        System.out.println(b);

        a.concat("b");
        System.out.println(a);

        String c = "world";

        System.out.println(a == c);
        System.out.println(a.equals(c));

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(b == s1);
        System.out.println(b.equals(s1));

        String s = "Java";
        s = s + " Programming";

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");

        System.out.println(sb1);

    }
}
