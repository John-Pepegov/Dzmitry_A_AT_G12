package homework.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        // Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb) (через Stream.of())
        Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb")
                // Для каждого элемента стрима пробежаться по отдельным словам
                .flatMap(x -> Arrays.stream(x.split("[\\s\\-]")))
                .map(word -> {
                    int len = word.length();
                    return (len % 2 == 0)
                            // Eсли четное, то заменить слово на число количества буков в этом слове
                            ? String.valueOf(len)
                            // Eсли слово нечетное, то заменить в нем все буквы "e" на букву "o"
                            : word.replace("e", "o");
                })
                // Оставить в потоке только уникальные значения
                .distinct()
                // Отпечатать в консоль с новой строки
                .forEach(System.out::println);
    }
}
