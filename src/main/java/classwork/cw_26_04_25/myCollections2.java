package classwork.cw_26_04_25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class myCollections2 {
    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();

        long startTime1 = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            myArrayList.add("test" + i);
        }

        System.out.println("myArrayList add: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");

        startTime1 = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            myLinkedList.add("test" + i);
        }

        System.out.println("myLinkedList add: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");
        System.out.println("----------------------");

        startTime1 = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            myArrayList.get(i);
        }

        System.out.println("myArrayList get: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");

        startTime1 = System.nanoTime();

        for (int i = 0; i < 100_000; i++) {
            myLinkedList.get(i);
        }
        System.out.println("myLinkedList get: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");
        System.out.println("----------------------");
    }
}
