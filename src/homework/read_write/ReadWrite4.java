package homework.read_write;

import java.io.*;

public class ReadWrite4 {
    //читает текст из файла, убирает из него все согласные и записывает новый текст в тот же файл в конец, через пустую строку ниже оригинала

    public static void main(String[] args) {
        File file = new File("rewrite.txt");
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
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        ) {
            writer.newLine();
            writer.newLine();
            writer.write(data.toString());
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        }
    }
}
