package classwork.cw_26_04_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myCollections6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        String text = "Оля, Коля, Аня, Миша, Даша";
        names.addAll(Arrays.asList(text.split(", ")));

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("------------------");

        names.set(2,"Оля");
        names.set(4, "Катя");

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
        System.out.println("------------------");

        names.remove("Оля");
        names.remove(3);

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
