package homework.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class NoodleList {
    public static void main(String[] args) {
        // Создать пустой список стрингов noodles (через new ArrayList)
        List<String> noodles = new ArrayList<>();

        // Добавить в список 4 вида макарон (Hakka, Ramen, Hibachi, Schezwan)
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        // Проитерировать список через for-each и отпечатать слова в консоль через тире
        System.out.print("Через тире: ");
        boolean first = true;
        for (String noodle : noodles) {
            if (!first) {
                System.out.print("-");
            }
            System.out.print(noodle);
            first = false;
        }
        System.out.println();

        System.out.println("---------------------");

        // Заменить в каждом слове буквы "а" на букву "о"
        noodles.replaceAll(x -> x.replace('a', 'o'));

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        System.out.print("После замены: ");
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
        System.out.println();
    }
}