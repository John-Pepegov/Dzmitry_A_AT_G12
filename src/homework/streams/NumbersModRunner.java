package homework.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        String[] digits = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

        // Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
        Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090)
                // Отфильтровать те числа, которые содержать цифру 3
                .map(String::valueOf)
                .filter(x -> x.contains("3"))
                // Разбить числа на отдельные цифры
                .flatMap(x -> Arrays.stream(x.split(""))
                        // Заменить цифры соответствующими словами
                        .map(c -> digits[Integer.parseInt(c)]))
                // Оставить только уникальные слова
                .distinct()
                // Отсортировать в нисходящем порядке
                .sorted(Comparator.reverseOrder())
                // Отпечатать в консоль с новой строки
                .forEach(System.out::println);
    }
}
