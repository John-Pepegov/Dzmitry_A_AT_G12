package homework.readwrite;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadWrite6 {
    // читает текст из файла, считает в тексте количество символов и записывает результат в новый файл, имя которого строится по маске текущая_дата_время_количество

    public static void main(String[] args) {
        File originalFile = new File("read_write_data/ReadWrite6.txt");
        int charCount = 0;

        // Считаем символы, исключая '\r'
        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch != '\r') {
                    charCount++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Формируем имя файла: дата_время_количество.txt
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String outputFileName = String.format("read_write_data/%s_%d.txt", timestamp, charCount);
        File newFile = new File(outputFileName);

        // Записываем результат
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            writer.write(String.format("Total characters in %s: %d", originalFile.getName(), charCount));
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
