package homework.streams;

import homework.collections.entities.Sand;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandRunner {
    public static void main(String[] args) {
        // Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
        List<Sand> sandbox = new ArrayList<>();

        // Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11)
        // и именами (Речной, Речной, Карьерный, Карьерный, Речной)
        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        Map<Integer, String> sandMap = sandbox.stream()
                // Отфильтровать песок, где вес > 9 и имя содержит букву "ч"
                .filter(sand -> sand.getWeight() > 9 && sand.getName().contains("ч"))
                // Отсортировать по весу в восходящем порядке
                .sorted(Comparator.comparing(Sand::getWeight))
                // На основании существующего потока данных создать новый,
                // в котором каждый новый Sand имеет вес умноженный на 2, и имя в верхнем регистре
                .map(sand -> new Sand(sand.getWeight() * 2, sand.getName().toUpperCase()))
                // На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
                .collect(Collectors.toMap(
                        Sand::getWeight,
                        Sand::getName
                ));

        System.out.println("Содержимое карты (value -> key):");
        sandMap.forEach((k, v) -> System.out.println(v + " -> " + k));

        System.out.println("---------------------");

        // Отпечатать каждый из элементов карты в виде value:key в текстовый файл
        File file = new File("read_write_data/Sand.txt");

        try (FileWriter writer = new FileWriter(file)) {
            for (Map.Entry<Integer, String> entry : sandMap.entrySet()) {
                writer.write(entry.getValue() + " -> " + entry.getKey() + System.lineSeparator());
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
    }
}
