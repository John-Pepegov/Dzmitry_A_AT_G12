package homework.streams;

import java.util.ArrayList;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        // Создать пустой список стрингов butterflies (через new ArrayList)
        List<String> butterflies = new ArrayList<>();

        // Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        // Добавить к каждому элементу кавычки
        // Оставить только те слова, которые содержат букву "a" и букву "о"
        // Вывести слова в консоль с новой строки
        butterflies.stream()
                .map(x -> "\"" + x + "\"")
                .filter(x -> x.contains("a") && x.contains("o"))
                .forEach(System.out::println);
    }
}
