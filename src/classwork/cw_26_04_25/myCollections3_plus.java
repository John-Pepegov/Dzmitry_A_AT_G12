package classwork.cw_26_04_25;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class myCollections3_plus {
    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<>();
        Set<String> myTreeSet = new TreeSet<>();

        long startTime1 = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            myHashSet.add("test" + i);
        }

        System.out.println("HashSet insert time: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");

        startTime1 = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            myTreeSet.add("test" + i);
        }

        System.out.println("TreeSet insert time: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");
        System.out.println("----------------------");

        startTime1 = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            // do nothing
        }

        System.out.println("HashSet iteration time: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");

        startTime1 = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            // do nothing
        }
        System.out.println("TreeSet iteration time: " + (System.nanoTime() - startTime1) / 1_000_000_000.0 + " seconds");
        System.out.println("----------------------");
    }
}
