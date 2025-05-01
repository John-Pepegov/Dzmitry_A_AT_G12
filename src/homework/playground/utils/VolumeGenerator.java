package homework.playground.utils;

import homework.playground.essence.material.*;

import java.util.Random;

public class VolumeGenerator {
    private static final Random random = new Random();

    public static int generateVolume(Pourable pourable) {
        int volume;

        if (pourable instanceof Water) {
            volume = random.nextInt(50) + 50; // 50–99
        } else if (pourable instanceof Petrol || pourable instanceof Diesel) {
            volume = random.nextInt(49) + 1;  // 1–49
        } else {
            System.out.println("VolumeGenerator: Not petrol, diesel or water");
            volume = 0;
        }

        System.out.printf(
                "VolumeGenerator: I have generated volume of %s with value: %d%n",
                pourable.getClass().getSimpleName(), volume
        );

        return volume;
    }
}