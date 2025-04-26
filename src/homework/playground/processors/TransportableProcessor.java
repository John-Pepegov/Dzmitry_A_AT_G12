package homework.playground.processors;

import homework.playground.essence.craft.Transportable;
import homework.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int distance = transportable.move(pointA, pointB);
        System.out.println(String.format(
                "Transportable %s was moved to %d points",
                transportable.getClass().getSimpleName(),
                distance
        ));
    }

    public void runTransportable(Transportable transportable) {
        int pointA = CoordinatesGenerator.generateCoordinate();
        int pointB = CoordinatesGenerator.generateCoordinate();
        int distance = transportable.move(pointA, pointB);
        System.out.println(String.format(
                "Transportable %s was moved to %d points",
                transportable.getClass().getSimpleName(),
                distance
        ));
    }
}
