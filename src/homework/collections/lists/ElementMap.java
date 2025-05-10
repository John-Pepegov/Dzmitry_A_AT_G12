package homework.collections.lists;

import java.util.HashMap;
import java.util.Map;

public class ElementMap {
    public static void main(String[] args) {
        // Создать пустую коллекцию ключ-значение elements, содержащую Integer в качестве ключей,
        // стринги в качестве значения (через new HashMap)
        Map<Integer, String> elements = new HashMap<>();

        // Добавить в список 7 элементов (Silicon, Sulfur, Argon, Calcium, Chromium, Iron, Zinc)
        // с ключами, равными порядку их добавления в коллекцию, начиная с 1-цы
        int key = 1;
        elements.put(key++, "Silicon");
        elements.put(key++, "Sulfur");
        elements.put(key++, "Argon");
        elements.put(key++, "Calcium");
        elements.put(key++, "Chromium");
        elements.put(key++, "Iron");
        elements.put(key++, "Zinc");

        // Проитерировать коллекцию через for-each и отпечатать название элементов в консоль через пробел
        System.out.print("Названия: ");
        for (String name : elements.values()) {
            System.out.print(name + " ");
        }

        System.out.println("\n---------------------");

        // Посчитать сколько названий элементов содержит букву "u" и вывести число в консоль
        int counter = 0;
        for (String name : elements.values()) {
            if (name.toLowerCase().contains("u")) {
                counter++;
            }
        }
        System.out.println("Названий элементов содержит букву 'u': " + counter);

        System.out.println("---------------------");

        // Проитерировать коллекцию и отпечатать пары ключ-значение в консоль с новой строки
        System.out.println("Пары ключ -> значение:");
        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("---------------------");

        // Заменить значение 4-го элемента на Selenium
        elements.replace(4, "Selenium");

        // Удалить 2-й элемент коллекции
        elements.remove(2);

        // Проитерировать коллекцию и отпечатать пары ключ-значение в консоль с новой строки
        System.out.println("Пары ключ -> значение (после изменений):");
        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
