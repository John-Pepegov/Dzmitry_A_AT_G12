package homework.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    private static final Random random = new Random();

    public static int generateDistance() {
        int distance = random.nextInt(99) + 1; // от 1 (включая) до 100 (исключая)
        System.out.println(String.format(
                "DistanceGenerator: I have generated distance with value: %d",
                distance
        ));
        return distance;
    }
}
