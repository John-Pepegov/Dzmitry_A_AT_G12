package homework.collections.lists;

import homework.collections.entities.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SandList {
    public static void main(String[] args) {
        // Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
        List<Sand> sandbox = new ArrayList<>();

        // Заполнить 4 объектами песка с весом (2, 4, 2, 7) и именами (Речной, Речной, Карьерный, Речной) соответственно
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        // Проитерировать список через for-each и отпечатать вес в консоль через пробел
        System.out.print("Вес: ");
        for (Sand s : sandbox) {
            System.out.print(s.getWeight() + " ");
        }

        System.out.println("\n---------------------");

        // Проитерировать список через for-each и отпечатать имена в консоль через пробел
        System.out.print("Имена: ");
        for (Sand s : sandbox) {
            System.out.print(s.getName() + " ");
        }

        System.out.println("\n---------------------");

        // Создать пустую карту, где ключом является целое число, а значением объект песка
        Map<Integer, Sand> sandMap = new HashMap<>();

        // Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число
        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i + 1, sandbox.get(i));
        }

        // Проитерировать карту и отпечатать ключи в консоль
        System.out.print("Ключи: ");
        for (int key : sandMap.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println("\n---------------------");

        // Проитерировать карту и отпечатать значения в консоль
        System.out.println("Значения:");
        for (Sand value : sandMap.values()) {
            System.out.println(value);
        }

        System.out.println("---------------------");

        // Проитерировать карту и отпечатать пары ключ-значение в консоль
        System.out.println("Пары ключ -> значение:");
        for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
