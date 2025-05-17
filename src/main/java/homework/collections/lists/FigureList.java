package homework.collections.lists;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FigureList {
    public static void main(String[] args) {
        // Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс)
        // через (Arrays.asList())
        List<String> figures = new ArrayList<>(Arrays.asList(
                "Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"
        ));

        // Проитерировать список через for-each и отпечатать слова в файл figures через тире
        try (FileWriter writer = new FileWriter("test_data/Figures.txt")) {
            boolean first = true;
            for (String figure : figures) {
                if (!first) {
                    writer.write(" - ");
                }
                writer.write(figure);
                first = false;
            }
            System.out.println("Файл успешно записан!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        System.out.println("---------------------");

        // Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
        int counter = 0;
        for (String figure : figures) {
            if (!figure.toLowerCase().contains("и")) {
                counter++;
            }
        }
        System.out.println("Фигур без буквы 'и': " + counter);

        System.out.println("---------------------");

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        System.out.print("Список по индексу через пробел: ");
        for (int i = 0; i < figures.size(); i++) {
            System.out.print(figures.get(i) + " ");
        }

        System.out.println("\n---------------------");

        // Вставить на 3 позицию Треугольник
        figures.add(3, "Треугольник");
        System.out.println(figures);

        System.out.println("---------------------");

        // Проитерировать список через for-each и отпечатать слова в консоль через пробел
        System.out.print("Список через for-each и пробел: ");
        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}