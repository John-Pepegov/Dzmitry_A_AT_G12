package homework.streams;

import homework.collections.entities.Water;

import java.util.Comparator;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        // Создать поток данных water класса Water (через new Stream.of)
        // из 4 объектов воды с цветом (Прозрачная, Прозрачная, Мутная, Синяя) и запахом (Нет, Нет, Аммиачный, Мятный)
        Stream<Water> waterStream = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный")
        );

        // Отфильтровать воду, цвет которой не "Прозрачная"
        String finalSmell = waterStream.filter(water -> !water.getColor().equals("Прозрачная"))
                // Отсортировать в нисходящем порядке по запаху
                .sorted(Comparator.comparing(Water::getSmell).reversed())
                // На основании существующего потока данных создать новый,
                // в котором каждая новая Water имеет запах с удвоенной буквой ы, если такая встречается
                .map(water -> {
                    String newSmell = water.getSmell().replace("ы", "ыы");
                    return new Water(water.getColor(), newSmell);
                })
                // Объединить запах всех объектов в одну строку
                .map(Water::getSmell)
                .reduce("", String::concat);

        // Найти количество буков в ней и отпечатать в консоль
        System.out.println(finalSmell + " -> кол-во символов: " + finalSmell.length());
    }
}
