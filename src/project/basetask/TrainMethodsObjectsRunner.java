package project.basetask;

public class TrainMethodsObjectsRunner {
    //создать класс TrainMethodsObjectsRunner с методом main, в котором создать обьект класса TrainMethodsObjects, и вызвать всего его методы

    public static void main(String[] args) {
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();

        trainMethodsObjects.processMouse(new Mouse("Валера",1));
        System.out.println("---");
        trainMethodsObjects.processSauce(new Sauce("Терияки","Темный"));
        System.out.println("---");
        trainMethodsObjects.processBee(new Bee("м", 2));
        System.out.println("---");
        trainMethodsObjects.processObstacle(new Obstacle("Взорвался насос", "Критичное"));
        System.out.println("---");
        trainMethodsObjects.processPineapple(new Pineapple("Особый",1800.246));
    }
}
