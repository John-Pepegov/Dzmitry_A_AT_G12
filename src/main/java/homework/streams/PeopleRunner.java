package homework.streams;

import homework.collections.entities.Person;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PeopleRunner {
    public static void main(String[] args) {
        // Создать поток данных people класса Person (через new Stream.of)
        // с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        );

        // Отфильтровать людей, которые моложе 60
        int avgAge = (int) people.filter(person -> person.getAge() < 60)
                // Отсортировать в восходящем порядке по именам
                .sorted(Comparator.comparing(Person::getName))
                // На основании существующего потока данных создать новый,
                // в котором каждый новый Person имеет возраст на 4 года больше исходного
                .map(person -> new Person(person.getAge() + 4, person.getName()))
                .peek(System.out::println)
                // Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);

        System.out.println("Средний возраст: " + avgAge);

        File file = new File("read_write_data/People.txt");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Средний возраст: " + avgAge);
            System.out.println("Файл успешно записан!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("Открытие файла не поддерживается на этой системе.");
            }
        } catch (IOException e) {
            System.out.println("Не удалось открыть файл: " + e.getMessage());
        }
    }
}
