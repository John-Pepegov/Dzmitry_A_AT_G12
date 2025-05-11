package homework.streams;

import homework.collections.entities.Bubble;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Random random = new Random();
        // Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Stream.of())
        int totalVolume = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9)
                // Округлить каждое число до целого
                .mapToInt(x -> (int) Math.round(x))
                .boxed()
                // На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел
                // с границами от 0 до числа из исходного потока данных
                .flatMap(x -> random.ints(0, x + 1)
                        .limit(x)                  // можно выбрать фиксированное количество, или n
                        .boxed())
                // Убрать дубликаты значений
                .distinct()
                // Заменить каждое число в получившемся потоке данных новым потоком
                // состоящим из объектов Bubble в количестве равному заменяемому числу,
                // создавая объекты с объемом равным числу из исходного потока и именем
                // по маске "Bubble vol-" + i, где i - число из исходного потока
                .flatMap(num -> IntStream.range(0, num)
                        .mapToObj(i -> new Bubble(num, "Bubble vol-" + num)))
                // Отпечатать в консоль каждый из объектов нового потока с новой строки
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume)
                .sum();
        // Найти общий объем полученного потока пузырьков и отпечатать в консоль
        System.out.println("Общий объём пузырьков: " + totalVolume);
    }
}
