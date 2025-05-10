package homework.collections.lists;

import java.util.Arrays;
import java.util.List;

public class DoubleList {
    public static void main(String[] args) {
        // Создать список дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Arrays.asList())
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        // Проитерировать список через for-each и отпечатать числа в консоль через пробел
        System.out.print("Числа: ");
        for (Double number : doubles) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("---------------------");

        // Посчитать произведение всех чисел и вывести результат в консоль
        double product = 1.0;
        for (Double number : doubles) {
            product *= number;
        }
        System.out.printf("Произведение всех чисел: %.3f\n", product);

        System.out.println("---------------------");

        // Найти сумму всех дробных частей и вывести результат в консоль
        double sum = 0.0;
        for (Double number : doubles) {
            sum += number - number.intValue();
        }
        System.out.println("Сумма всех дробных частей: " + sum);

        System.out.println("---------------------");

        // Проитерировать список по индексу и вывести целые части в консоль через пробел
        System.out.print("Целые части: ");
        for (int i = 0; i < doubles.size(); i++) {
            System.out.print(doubles.get(i).intValue() + " ");
        }
        System.out.println();
    }
}
