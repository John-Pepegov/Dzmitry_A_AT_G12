package homework.playground.essence.material;

import homework.playground.essence.Matter;

public class Petrol extends Matter implements Pourable, Powerable {
    public Petrol(int mass) {
        super(mass);
    }
}
