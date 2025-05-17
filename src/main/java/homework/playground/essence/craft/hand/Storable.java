package homework.playground.essence.craft.hand;

import homework.playground.essence.Matter;
import homework.playground.essence.material.Pourable;

public interface Storable {
    default void store(Pourable pourable, int amount) {
        pourable.spread(((Matter) this).getName());

        System.out.printf(
                "I am %s, my name is %s and I received %d of %s%n",
                this.getClass().getSimpleName(),
                ((Matter) this).getName(),
                amount,
                pourable.getClass().getSimpleName()
        );
    }
}