package homework.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ElementList {
    public static void main(String[] args) {
        // Создать пустой список стрингов elements (через new ArrayList)
        List<String> elements = new ArrayList<>();

        // Добавить в список 6 элементов(Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        // Проитерировать список через for-each и отпечатать слова в консоль через пробел
        System.out.print("Элементы через пробел: ");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("---------------------");

        // Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
        int counter = 0;
        for (String element : elements) {
            if (element.trim().contains(" ")) {
                counter++;
            }
        }
        System.out.println("Элементов, где в названии больше одного слова: " + counter);

        System.out.println("---------------------");

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        System.out.print("Список по индексу через пробел: ");
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
        System.out.println();

        System.out.println("---------------------");

        // На четвертую позицию добавить Spinner
        elements.add(3, "Spinner");

        // Удалить второй элемент списка
        elements.remove(1);

        // Заменить пятый элемент на Switch
        if (elements.size() > 4) {
            elements.set(4, "Switch");
        }

        // Проитерировать список через for -each и отпечатать слова в консоль через пробел
        System.out.print("Финальный список: ");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}