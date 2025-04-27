package homework.playground.essence.craft;

public interface Rideable {
    default void drive(String direction) {
        System.out.println(String.format(
                "I am %s, my name is %s and I am driving to %s",
                this.getClass().getSimpleName(),
                ((homework.playground.essence.Matter) this).getName(),
                direction
        ));
    }
}