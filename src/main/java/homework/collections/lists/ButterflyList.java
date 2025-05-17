package homework.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ButterflyList {
    public static void main(String[] args) {
        // Создать пустой список стрингов butterflies (через new ArrayList)
        List<String> butterflies = new ArrayList<>();

        // Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        // Проитерировать список через for-each и напечатать слова в консоль в кавычках
        System.out.println("Слова в кавычках:");
        for (String butterfly : butterflies) {
            System.out.println("\"" + butterfly + "\"");
        }

        System.out.println("---------------------");

        // Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
        int counter = 0;
        for (String butterfly : butterflies) {
            if (butterfly.toLowerCase().contains("o")) {
                counter++;
            }
        }
        System.out.println("Бабочек с буквой 'o': " + counter);

        System.out.println("---------------------");

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        System.out.print("Список по индексу через пробел: ");
        for (int i = 0; i < butterflies.size(); i++) {
            System.out.print(butterflies.get(i) + " ");
        }

        System.out.println("\n---------------------");

        // Проитерировать список через for-each и отпечатать слова в консоль через перенос строки
        System.out.print("Список через for-each с новой строки: ");
        for (String butterfly : butterflies) {
            System.out.print("\n" + butterfly);
        }
    }
}
