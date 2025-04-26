package homework.playground.essence.creatures;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (this.mass < home.getMass()) {
            int familySize = home.getMass() / this.mass;
            System.out.println(String.format("I am %s and I will nest there with %d my family members!", name, familySize));
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}