package homework.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class CountryList {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();

        // Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        // Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
        int counter = 0;
        for (String country : countries) {
            System.out.print(country);
            if ((++counter < countries.size())) {
                System.out.print(", ");
            } else {
                System.out.print("\n");
            }
        }

        System.out.println("---------------------");

        // Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
        int shortNames = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                shortNames++;
            }
        }
        System.out.println("Стран с названием меньше 7 букв: " + shortNames);

        System.out.println("---------------------");

        // Проитерировать список по индексу и отпечатать слова в консоль с новой строки
        System.out.println("Все страны:");
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}

