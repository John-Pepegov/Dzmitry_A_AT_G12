package classwork.cw_26_04_25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class myCollection3 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        String text = "мама мыла раму мыла";
        String[] words = text.split(" ");

        for (String word : words) {
            mySet.add(word);
        }

        System.out.println(mySet);
        System.out.println("------------------");

        for (String word : mySet) {
            System.out.println(word);
        }

        System.out.println("------------------");

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
