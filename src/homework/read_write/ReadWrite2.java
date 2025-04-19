package homework.read_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite2 {
    // записывает в файл фразу "Hello, I just got 'X' from you!", где Х - фраза, вводимая в консоль с клавиатуры

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test_data/ReadWrite2.txt", true))) {
            while (true) {
                System.out.print("Type your text here or type 'stop' to exit: ");
                String incoming = scanner.nextLine();

                if (incoming.equalsIgnoreCase("stop")) {
                    System.out.println("Program stopped.");
                    break;
                }

                String result = "Hello, I just got '" + incoming + "' from you!";
                System.out.println(result);
                writer.write(result);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}