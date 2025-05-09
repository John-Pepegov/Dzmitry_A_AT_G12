package homework.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class CityList {
    public static void main(String[] args) {
        // Создать пустой список стрингов cities (через new ArrayList)
        List<String> cities = new ArrayList<>();

        // Добавить в список 3 города (Минск, Москва, Берлин)
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        // Проитерировать список через for-each и отпечатать слова в консоль с новой строки
        System.out.println("Города по строкам:");
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("---------------------");

        // Посчитать сумму всех букв во всех словах и вывести число в консоль
        int totalLetters = 0;
        for (String city : cities) {
            totalLetters += city.length();
        }
        System.out.println("Общее количество букв: " + totalLetters);

        System.out.println("---------------------");

        // Проитерировать список по индексу и отпечатать слова в консоль через пробел
        System.out.print("Города через пробел: ");
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
