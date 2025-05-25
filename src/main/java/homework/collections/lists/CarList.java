package homework.collections.lists;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarList {
    public static void main(String[] args) {
        // Создать набор строк стрингов cars из 7 авто
        // (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        // Проитерировать список через for-each и отпечатать слова в файл cars с новой строки в кавычках
        File file = new File("read_write_data/Cars.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (String car : cars) {
                writer.write("\"" + car + "\"\n");
            }
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

        System.out.println("---------------------");

        // Найти и удалить из набора авто, в названии которых больше 4 букв
        cars.removeIf(car -> car.length() > 4);

        // Проитерировать список через for-each и отпечатать слова в консоль через пробел
        System.out.print("Список через for-each и пробел: ");
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
