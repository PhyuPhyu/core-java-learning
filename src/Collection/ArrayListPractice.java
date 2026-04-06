package Collection;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("jave");
        a.add("go");
        a.add("javascript");
        System.out.println(a);

        a.add(0, "java");
        System.out.println(a);

        a.remove("jave");
        System.out.println(a);
        a.add("go");
        System.out.println(a);

        System.out.println(a.get(2));
        System.out.println(a.indexOf("go"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
        System.out.println(a.lastIndexOf("go"));
    }
}
