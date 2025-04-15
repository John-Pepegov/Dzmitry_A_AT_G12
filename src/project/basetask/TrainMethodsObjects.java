package project.basetask;

public class TrainMethodsObjects {
    //создать класс TrainMethodsObjects и в нем
    //создать метод processMouse, который принимает на вход обьект мыши (Mouse)
    //и печатает в консоль ее имя, возраст и вызывающий метод printMouseDetails
    //создать метод processSouce, который принимает на вход обьект соуса (Souce) и печатает в консоль его имя, цвет и вызывающий метод printSouceDetails
    //создать метод processBee, который принимает на вход обьект пчелы (Bee)
    //и печатает в консоль ее пол, вес и вызывающий метод printBeeDetails
    //создать метод processObstacle, который принимает на вход обьект препятствия (Obstacle) и печатает в консоль его описание, важность и вызывающий метод printObstacleDetails
    //создать метод processPineapple, который принимает на вход обьект ананаса (Pineapple)
    //и печатает в консоль его сорт, теплоемкость и вызывающий метод printPineappleDetails

    public void processMouse(Mouse mouse) {
        System.out.println("Name: " + mouse.getName());
        System.out.println("Age: " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSauce(Sauce sauce) {
        System.out.println("Name: " + sauce.getName());
        System.out.println("Color: " + sauce.getColor());
        sauce.printSauceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println("Gender: " + bee.getGender());
        System.out.println("Weight: " + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Description: " + obstacle.getDescription());
        System.out.println("Severity: " + obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println("Grade: " + pineapple.getGrade());
        System.out.println("Heat capacity: " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }
}
