package homework.streams;

import java.util.List;
import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
        // Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Stream.of())
        List<String> figures = Stream.of(
                "Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"
        ).toList();

        // Заменить каждое слово на целое число, соответствующее количеству буков в слове
        // Отфильтровать числа, которые больше 4
        // Отпечатать все оставшиеся числа в консоль
        figures.stream()
                .map(String::length)
                .filter(len -> len > 4)
                .forEach(System.out::println);
    }
}
