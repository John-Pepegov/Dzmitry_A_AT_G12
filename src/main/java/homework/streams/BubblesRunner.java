package homework.streams;

import homework.collections.entities.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubblesRunner {
    public static void main(String[] args) {
        // Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с объемами (2, 4, 5)
        // и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO")
        );

        int totalVol = bubbles.stream()
                // В потоке данных отфильтровать только те пузыри, объем которых больше 3
                .filter(b -> b.getVolume() > 3)
                // Отсортировать данные по имени в восходящем порядке
                .sorted(Comparator.comparing(Bubble::getName))
                // На основании существующего потока данных создать новый,
                // в котором каждый новый Bubble имеет объем в 3 раза больше исходного
                .map(b -> new Bubble(b.getVolume() * 3, b.getName()))
                .peek(System.out::println)
                // Вычислить сумму конечного объема всех пузырей и отпечатать в консоль
                .mapToInt(Bubble::getVolume)
                .sum();

        System.out.println("Сумма объёмов новых пузырей: " + totalVol);
    }
}
