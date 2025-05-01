package classwork.cw_26_04_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myCollections7 {
    public static void main(String[] args) {
        List<String> vegetables = new ArrayList<>();

        String text = "Помидор, Огурец, Кабачок, Батат, Картоха";
        vegetables.addAll(Arrays.asList(text.split(", ")));

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
        System.out.println();
        System.out.println("--------------------");

        int counter = 0;
        for (String vegetable : vegetables) {
            if (vegetable.contains("а")) {
                counter++;
                System.out.print(vegetable + " ");
            }
        }
        System.out.println("- " + counter + " овоща(ей) содержат букву 'a'");
        System.out.println("--------------------");

        vegetables.remove("Огурец");
        vegetables.remove(3);

        for (String vegetable : vegetables) {
            System.out.print(vegetable + " ");
        }
    }
}
