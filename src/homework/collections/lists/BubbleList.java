package homework.collections.lists;

import homework.collections.entities.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubbleList {
    public static void main(String[] args) {
        // Создать список пузырей (класса Bubble) bubbles из 3 пузырьков
        // с объемами (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")
        );

        // Проитерировать список через for-each и отпечатать объемы в консоль через пробел
        System.out.print("Объёмы: ");
        for (Bubble b : bubbles) {
            System.out.print(b.getVolume() + " ");
        }

        System.out.println("\n---------------------");

        // Проитерировать список через for-each и отпечатать имена в консоль через пробел
        System.out.print("Имена: ");
        for (Bubble b : bubbles) {
            System.out.print(b.getName() + " ");
        }

        System.out.println("\n---------------------");

        // Посчитать объем всех пузырей и вывести число в консоль
        int totalVolume = 0;
        for (Bubble b : bubbles) {
            totalVolume += b.getVolume();
        }
        System.out.println("Сумма объёмов: " + totalVolume);

        System.out.println("---------------------");

        // Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки
        System.out.println("Детали пузырей:");
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i));
        }
    }
}
