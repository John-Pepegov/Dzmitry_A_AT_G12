package homework.collections.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberList {
    public static void main(String[] args) {
        // Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        // Проитерировать список через for-each и отпечатать числа в консоль новой строки
        System.out.println("Числа по строкам:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("---------------------");

        // Посчитать сумму всех чисел и вывести результат в консоль
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех чисел: " + sum);

        System.out.println("---------------------");

        // Отсортировать список по возрастанию
        Collections.sort(numbers);

        // Проитерировать список по индексу и отпечатать числа в консоль через пробел
        System.out.print("Отсортированные по индексу: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        System.out.println("---------------------");

        // Развернуть список в обратном порядке
        Collections.reverse(numbers);

        // Проитерировать список через for-each и отпечатать числа в консоль через пробел
        System.out.print("В обратном порядке: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
