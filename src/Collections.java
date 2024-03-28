import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
    static Collection<String> names = new ArrayList<>();

    static void addCollection() {
        System.out.println("Add Collection");

        names.add("Sany");
        names.add("Jimin");
        names.addAll(Arrays.asList("Kai", "Chaenwoo"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void removeCollection() {
        System.out.println("Remove Collection");

        names.add("Sany");
        names.add("Jimin");
        names.addAll(Arrays.asList("Kai", "Chaenwoo"));

        names.remove("Sany");
        names.removeAll(Arrays.asList("Kai", "Chaenwoo"));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }

    static void checkCollection() {
        System.out.println("Check Collection");

        names.add("Sany");
        names.add("Jimin");
        names.addAll(Arrays.asList("Kai", "Chaenwoo"));

        System.out.println(names.contains("Sany"));
        System.out.println(names.containsAll(Arrays.asList("Kai", "Chaenwoo")));

        names.remove("Sany");
        names.removeAll(Arrays.asList("Kai", "Chaenwoo"));

        System.out.println(names.contains("Sany"));
        System.out.println(names.containsAll(Arrays.asList("Kai", "Chaenwoo")));

        System.out.println();
    }
}
