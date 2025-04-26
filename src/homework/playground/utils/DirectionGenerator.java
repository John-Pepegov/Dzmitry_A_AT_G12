package homework.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    private static final Random random = new Random();

    public static String generateDirection() {
        int number = random.nextInt(39) + 1; // случайное число от 1 (включая) до 40 (исключая)
        if (number <= 9) {
            return "NORTH";
        } else if (number <= 19) {
            return "SOUTH";
        } else if (number <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}