package classwork.cw_29_04_25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Collections.emptyList;
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
        System.out.println("1: " + value1);

        String value2 = list.stream().findFirst().orElse("мама");
        System.out.println("2: " + value2);

        String value3 = list.stream().filter("мама"::equals).findFirst().get();
        System.out.println("3: " + value3);

        String value4 = list.stream().skip(4).findFirst().get();
        System.out.println("4: " + value4);

        List<String> value5 = list.stream().skip(2).limit(2).toList();
        System.out.println("5: " + value5);

        List<String> value6 = list.stream().filter(x -> x.contains("м")).distinct().toList();
        System.out.println("6: " + value6);

        // Найти существуют ли хоть один «мама» элемент в коллекции
        boolean value7 = list.stream().anyMatch("мама"::equals);
        System.out.println("7: " + value7);

        // Найти есть ли символ «м» у всех элементов коллекции
        boolean value8 = list.stream().allMatch(x -> x.contains("м"));
        System.out.println("8: " + value8);

        // Добавить "м" в конец каждого элемента и собрать в коллекцию
        List<String> value9 = list.stream().map(x -> x + "м").toList();
        System.out.println("9: " + value9);

        // Разделить все слова из коллекции по букве «а»,
        // убрать пустые элементы (состоящие из 0 символов)
        // и собрать в новую коллекцию
        List<String> value10 = list.stream()
                .flatMap(x -> Arrays.stream(x.split("а")))
                .filter(x -> !x.isEmpty())
                .toList();
        System.out.println("10: " + value10);

        // Отсортировать коллекцию строк по алфавиту
        List<String> value11 = list.stream().sorted().toList();
        System.out.println("11: " + value11);

        List<String> value12 = list.stream()
                .distinct()
                .sorted((x, y) -> -x.compareTo(y)).toList();
        System.out.println("12: " + value12);

        // Разделить слова по символам, отпечатать результат, выбрать символ с максимальным значением среди букв
        System.out.print("13: ");
        String value13 = list.stream()
                .flatMap(x -> Arrays.stream(x.split("")))
                .peek(x -> System.out.print(x + " "))
                .max(String::compareTo)
                .get();
        System.out.print("- " + value13);
    }
}