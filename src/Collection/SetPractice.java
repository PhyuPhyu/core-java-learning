package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();

        languages.add("go");
        languages.add("python");
        languages.add("java");
        languages.add("go");
        System.out.println(languages);

        languages.remove("python");
        System.out.println(languages);

        System.out.println(languages.isEmpty());
        System.out.println(languages.size());
        languages.add("ruby");

        Iterator<String> i = languages.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
