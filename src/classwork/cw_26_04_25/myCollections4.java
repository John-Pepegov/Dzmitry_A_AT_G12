package classwork.cw_26_04_25;

import java.util.HashMap;
import java.util.Map;

public class myCollections4 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        String text = "мама мыла раму мылом";
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            myMap.put(i, words[i]);
        }

        System.out.println(myMap);

        System.out.println("------------------");

        for (int key : myMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("------------------");

        for (String value : myMap.values()) {
            System.out.println(value);
        }

        System.out.println("------------------");

        for (int key : myMap.keySet()) {
            System.out.println(key + " : " + myMap.get(key));
        }

        System.out.println("------------------");

        System.out.println(myMap.entrySet());
    }
}
