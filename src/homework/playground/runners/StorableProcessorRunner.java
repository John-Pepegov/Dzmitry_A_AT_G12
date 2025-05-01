package homework.playground.runners;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.hand.Bottle;
import homework.playground.essence.craft.hand.Can;
import homework.playground.essence.craft.hand.Container;
import homework.playground.essence.craft.hand.Storable;
import homework.playground.essence.material.*;
import homework.playground.processors.StorableProcessor;

public class StorableProcessorRunner {
    public static void main(String[] args) {
        StorableProcessor processor = new StorableProcessor();

        // Первая группа
        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");

        // Вторая группа
        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
        Matter matterPetrol = new Petrol(2);
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);

        processor.runStorable(storableBottle, pourablePetrol);
        processor.runStorable(storableBottle, pourableDiesel);
        processor.runStorable(storableBottle, pourableWater);

        processor.runStorable(storableCan, pourablePetrol);
        processor.runStorable(storableCan, pourableDiesel);
        processor.runStorable(storableCan, pourableWater);

        processor.runStorable(bottle, pourablePetrol);
        processor.runStorable(bottle, pourableDiesel);
        processor.runStorable(bottle, pourableWater);

        processor.runStorable(can, pourablePetrol);
        processor.runStorable(can, pourableDiesel);
        processor.runStorable(can, pourableWater);

        // processor.runStorable(containerBottle, pourableWater); // Container не является Storable
        // processor.runStorable(containerCan, pourablePetrol);   // Container не является Storable

        // processor.runStorable(matterBottle, pourableWater); // Matter не является Storable
        // processor.runStorable(matterCan, pourableDiesel);   // Matter не является Storable

        // processor.runStorable(bottle, powerableDiesel); // powerableDiesel не является Pourable

        processor.runStorable(bottle, petrol);
        // processor.runStorable(bottle, matterPetrol); // matterPetrol не является Pourable

        // Тест с явным объёмом
        processor.runStorable(storableCan, pourableWater, 77);
        processor.runStorable(bottle, pourablePetrol, 12);
    }
}
