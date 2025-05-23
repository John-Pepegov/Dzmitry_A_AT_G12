package homework.readwrite;

import java.io.*;

public class ReadWrite5 {
    // читает текст из файла, считает в тексте количество символов и выводит результат в консоль.

    public static void main(String[] args) {
        File file = new File("test_data/ReadWrite5.txt");
        int charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch != '\r') {
                    charCount++;
                }
            }

            System.out.println("Total characters: " + charCount);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
