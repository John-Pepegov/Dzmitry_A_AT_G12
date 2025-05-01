package classwork.cw_29_04_25;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.list;

public class MyStreams {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

//        int counter = 0;
//        for (String string : list)
//            if (string.equals("мама")) {
//                int i1 = counter++;
//            }
//        System.out.println("opt1: " + counter);

        long value1 = list.stream().filter("мама"::equals).count();
        System.out.println(value1);

        String value2 = list.stream().findFirst().orElse("мама");
        System.out.println(value2);

        String value3 = list.stream().filter("мама"::equals).findFirst().get();
        System.out.println(value3);

        String value4 = list.stream().skip(4).findFirst().get();
        System.out.println(value4);

        List<String> value5 = list.stream().skip(2).limit(2).toList();
        System.out.println(value5);

        List<String> value6 = list.stream().filter(x -> x.contains("м")).distinct().toList();
        System.out.println(value6);
    }
}
