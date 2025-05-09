package homework.playground.runners;

import homework.playground.essence.craft.Rideable;
import homework.playground.essence.craft.field.Car;
import homework.playground.essence.craft.field.Moped;
import homework.playground.essence.craft.field.Motorbike;
import homework.playground.essence.craft.field.Vehicle;
import homework.playground.processors.RideableProcessor;

public class RideableProcessorRunner {
    public static void main(String[] args) {
        RideableProcessor processor = new RideableProcessor();

        Rideable rideableCar = new Car(223, "Lada Rideable");
        Rideable rideableMoped = new Moped(3452, "Honda EM1 837 Rideable");
        Rideable rideableMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Rideable");

        Vehicle vehicleCar = new Car(223, "Lada Vehicle");
        Vehicle vehicleMoped = new Moped(3452, "Honda EM1 837 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Vehicle");

        Car aCar = new Car(223, "Lada Car");
        Moped aMoped = new Moped(3452, "Honda EM1 837 Moped");
        Motorbike aMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Motorbike");

        Vehicle anonymousVehicle = new Vehicle(3452, "Honda EM1 837 Vehicle") {
        };

        Rideable anonymousRideable = new Rideable() {
            String name = "Anonymous";

            public void drive(String direction) {
                System.out.printf(
                        "I am %s, my name is %s and I am driving to %s%n",
                        this.getClass().getSimpleName(), this.name, direction
                );
            }
        };

        processor.runRideable(rideableCar);
        processor.runRideable(rideableMoped);
        processor.runRideable(rideableMotorbike);

        processor.runRideable(vehicleCar);
        processor.runRideable(vehicleMoped);
        processor.runRideable(vehicleMotorbike);

        processor.runRideable(aCar);
        processor.runRideable(aMoped);
        processor.runRideable(aMotorbike);

        // processor.runRideable(anonymousVehicle); // У анонимных классов нет собственного имени класса
        // processor.runRideable(anonymousRideable); // У анонимных классов нет собственного имени класса

        processor.runRideable(rideableCar, "никуда");
        processor.runRideable(rideableMotorbike, "повсюду");
    }
}
