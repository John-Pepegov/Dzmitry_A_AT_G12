package homework;

import java.util.Scanner;

public class ReadWrite1 {
    //выводит в консоль фразу "Hello, I just got 'X' from you!", где Х - фраза, вводимая в консоль с клавиатуры

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.toLowerCase().contains("стоп")) {
                return;
            }
            System.out.printf("Hello, I just got '%s' from you!%n", incoming);
        }
    }
}
