package project.bubles;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume, SparklingWater water) {
        this.volume = volume;
        this.water = water;
    }

    public void open() {
        if (water != null) {
            water.degas();
        }
    }
}
