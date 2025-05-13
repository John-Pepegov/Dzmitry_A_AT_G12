package homework.collections.lists;

import homework.collections.entities.Chair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnitureList {
    public static void main(String[] args) {
        // Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2)
        // и шириной (2, 2, 4) соответственно, через (Arrays.asList())
        List<Chair> furniture = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)
        );

        // Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел
        System.out.print("Площадь: ");
        for (Chair c : furniture) {
            System.out.print(c.getHeight() * c.getWidth() + " ");
        }

        System.out.println("\n---------------------");

        // Создать пустую карту, где ключом является целое число, а значением объект стула
        Map<Integer, Chair> chairMap = new HashMap<>();

        // Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i + 1, furniture.get(i));
        }

        // Проитерировать карту и отпечатать ключи в консоль
        System.out.print("Ключи: ");
        for (Integer key : chairMap.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println("\n---------------------");

        // Проитерировать карту и отпечатать значения в консоль
        System.out.println("Значения:");
        for (Chair value : chairMap.values()) {
            System.out.println(value);
        }

        System.out.println("---------------------");

        // Проитерировать карту и отпечатать пары ключ-значение в консоль
        System.out.println("Пары ключ -> значение:");
        for (Map.Entry<Integer, Chair> entry : chairMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
