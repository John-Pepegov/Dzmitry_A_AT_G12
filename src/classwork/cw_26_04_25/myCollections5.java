package classwork.cw_26_04_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myCollections5 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("------------------");

        colors.add(2, "Pink");
        colors.add(4, "Yellow");

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();
        System.out.println("------------------");

        System.out.print(colors.get(1) + " " + colors.get(5));
    }
}
