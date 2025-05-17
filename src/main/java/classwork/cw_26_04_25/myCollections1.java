package classwork.cw_26_04_25;

import java.util.ArrayList;
import java.util.List;

public class myCollections1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        String text = "мама мыла раму";
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            myList.add(words[i]);
        }

        System.out.println(myList);
        System.out.println("------------------");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("------------------");

        for (String s : myList) {
            System.out.println(s);
        }
    }
}
