package homework.playground.essence;

import homework.playground.essence.Matter;

public interface Flyable {
    default void fly(String direction) {
        System.out.println(String.format(
                "I am %s, my name is %s and I am flying to %s",
                this.getClass().getSimpleName(),
                ((Matter) this).getName(),
                direction
        ));
    }
}
