package project.bubles;

public class Bubble {
    private final double volume = 0.3;
    private String gasContent;

    public Bubble(String gasContent) {
        this.gasContent = gasContent;
    }

    public String getGasContent() {
        return gasContent;
    }

    public void setGasContent(String gasContent) {
        this.gasContent = gasContent;
    }

    public void pop() {
        System.out.println("Cramp!");
    }
}