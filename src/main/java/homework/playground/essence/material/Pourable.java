package homework.playground.essence.material;

public interface Pourable {
    default void spread(String storeName) {
        System.out.printf(
                "I am %s and I am spreading in %s%n",
                this.getClass().getSimpleName(), storeName
        );

        if (this instanceof Petrol) {
            System.out.println("wheeh..");
        } else if (this instanceof Diesel) {
            System.out.println("whooh..");
        } else if (this instanceof Water) {
            System.out.println("whobl-whobl..");
        }
    }
}