package homework.streams;

import java.util.stream.Stream;

public class NumbersRunner {
    public static void main(String[] args) {
        // Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
        int sum = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699)
                // В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
                .peek(System.out::println)
                // Отсортировать и снова отпечатать в консоль с новой строки
                .sorted()
                .peek(System.out::println)
                // Посчитать сумму всех чисел и вывести результат в консоль
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("---------------------");

        System.out.println("Сумма: " + sum);
    }
}
