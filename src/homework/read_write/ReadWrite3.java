package homework.read_write;

import java.io.*;

public class ReadWrite3 {
    // читает текст из файла, убирает из него все гласные и записывает новый текст в тот же файл, затирая оригинал

    public static void main(String[] args) {
        File originalFile = new File("rewrite.txt");
        File tempFile = new File("rewrite_temp.txt");

        try (
                BufferedReader reader = new BufferedReader(new FileReader(originalFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String result = line.replaceAll("[AEIOUYaeiouyАЕЁИОУЫЭЮЯаеёиоуыэюя]", "");
                writer.write(result);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        if (originalFile.delete()) {
            if (!tempFile.renameTo(originalFile)) {
                System.out.println("Не удалось переименовать файл.");
            }
        } else {
            System.out.println("Не удалось удалить оригинальный файл.");
        }
    }
}
