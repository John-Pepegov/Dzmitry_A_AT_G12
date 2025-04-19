package homework.read_write;

import java.io.*;

public class ReadWrite3 {
    // читает текст из файла, убирает из него все гласные и записывает новый текст в тот же файл, затирая оригинал

    public static void main(String[] args) {
        File originalFile = new File("test_data/ReadWrite3.txt");
        File tempFile = new File("test_data/ReadWrite3_temp.txt");

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
            System.err.println("Error: " + e.getMessage());
            return;
        }

        if (originalFile.delete()) {
            if (tempFile.renameTo(originalFile)) {
                System.out.println("File processed successfully.");
            } else {
                System.err.println("Failed to rename the file.");
            }
        } else {
            System.err.println("Failed to delete the original file.");
        }
    }
}
