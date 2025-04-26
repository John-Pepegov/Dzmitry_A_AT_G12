package homework.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    private static final Random random = new Random();

    public static int generateCoordinate() {
        int coordinate = random.nextInt(79) + 1; // случайное число от 1 (включая) до 80 (исключая)
        System.out.println(String.format(
                "CoordinatesGenerator: I have generated point with value: %d",
                coordinate
        ));
        return coordinate;
    }
}
