package homework.streams;

import java.util.List;
import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        // Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
        List<String> countries = Stream.of(
                "Андора", "Португалия", "Англия", "Замбия"
        ).toList();

        countries.stream()
                // Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
                .filter(x -> x.toLowerCase().matches(".*[аеёиоуыэюя].*"))
                // Отфильтровать страны, в названии которых меньше 7 букв
                .filter(x -> x.length() < 7)
                // Перевести все страны в верхний регистр
                .map(String::toUpperCase)
                // Добавить к каждому названию кавычки
                .map(x -> "\"" + x + "\"")
                // Отпечатать в консоль с новой строки
                .forEach(System.out::println);
    }
}
