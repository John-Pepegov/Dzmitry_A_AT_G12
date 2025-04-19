package project.bubles;

public class Runner {
    public static void main(String[] args) {
        SparklingWater water1 = new SparklingWater();
        SparklingWater water2 = new SparklingWater();
        SparklingWater water3 = new SparklingWater();

        water1.pump(generateBubbles(5000, "CO2"));
        water2.pump(generateBubbles(10000, "CO2"));
        water3.pump(generateBubbles(15000, "CO2"));

        Bottle bottle1 = new Bottle(0.5, water1);
        Bottle bottle2 = new Bottle(1.0, water2);
        Bottle bottle3 = new Bottle(1.5, water3);

        bottle1.open();
        System.out.println("----------------------------");
        bottle2.open();
        System.out.println("----------------------------");
        bottle3.open();
    }

    private static Bubble[] generateBubbles(int amount, String gas) {
        Bubble[] bubbles = new Bubble[amount];
        for (int i = 0; i < amount; i++) {
            bubbles[i] = new Bubble(gas);
        }
        return bubbles;
    }
}
