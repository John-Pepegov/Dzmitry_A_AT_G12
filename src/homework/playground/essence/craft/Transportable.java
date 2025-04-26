package homework.playground.essence.craft;

import homework.playground.essence.Matter;

public interface Transportable {
    default int move(int pointA, int pointB) {
        System.out.println(String.format(
                "I am %s, my name is %s and I am moving from point %d to point %d",
                this.getClass().getSimpleName(),
                ((Matter) this).getName(),
                pointA,
                pointB
        ));
        return pointB - pointA;
    }
}
