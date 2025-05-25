package homework.readwrite;

import java.io.*;

public class ReadWrite4 {
    // читает текст из файла, убирает из него все согласные и записывает новый текст в тот же файл в конец, через пустую строку ниже оригинала

    public static void main(String[] args) {
        File file = new File("read_write_data/ReadWrite4.txt");
        StringBuilder data = new StringBuilder();

        try (
                BufferedReader reader = new BufferedReader(new FileReader(file));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String result = line.replaceAll("[BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxzБВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ]", "");
                data.append(result).append(System.lineSeparator());
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        ) {
            writer.newLine();
            writer.newLine();
            writer.write(data.toString());
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
