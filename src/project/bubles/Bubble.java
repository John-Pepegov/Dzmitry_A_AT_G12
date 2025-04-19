package project.bubles;

class Bubble {
    private final double volume = 0.3; // в мм2
    private String gasComposition;

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void pop() {
        System.out.println("Cramp!");
    }
}