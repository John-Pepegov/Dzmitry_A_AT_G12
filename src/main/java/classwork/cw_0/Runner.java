package classwork.cw_0;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "стоп";

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.contains(text)) {
                return;
            }
            System.out.printf("Just got '%s' text!%n", incoming);

        }
    }
}