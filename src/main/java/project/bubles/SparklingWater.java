package project.bubles;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private int bubblesCount;

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
        this.bubblesCount = bubbles.length;
    }

    public void degas() {
        if (bubbles == null) {
            System.out.println("Нет пузырьков для выпуска.");
            return;
        }
        for (int i = 0; i < bubblesCount; i++) {
            bubbles[i].pop();
        }
        bubbles = null;
        bubblesCount = 0;
    }
}
