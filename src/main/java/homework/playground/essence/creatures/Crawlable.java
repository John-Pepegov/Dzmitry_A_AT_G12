package homework.playground.essence.creatures;

import homework.playground.essence.Matter;

public interface Crawlable {
    default void crawl(String direction, int distance) {
        System.out.println(String.format(
                "I am %s, my name is %s and I am crawling to %s for %d units",
                this.getClass().getSimpleName(),
                ((Matter) this).getName(),
                direction,
                distance
        ));

        if (this instanceof Crocodile) {
            System.out.println("wr-wr-wrr-r..");
        } else if (this instanceof Beetle) {
            System.out.println("vz-vz-vzz-zz..");
        }
    }
}