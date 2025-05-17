package project.basetask;

public class TrainMethodsString {
    //создать класс TrainMethodsString и в нем
    //-- создать невозвратный метод printMama, который ничего не принимает на вход и печатает в консоль «мама мыла раму»
    //-- создать невозвратный метод printPapa, который ничего не принимает на вход и печатает в консоль «папа мыла раму»
    //-- создать невозвратный метод printString, который принимает на вход строку и печатает в консоль эту строку
    //-- создать невозвратный метод printMamaString, который принимает на вход строку и печатает в консоль «мама мыла » и эту строку
    public void printMama() {
        System.out.println("мама мыла раму");
    }

    public void printPapa() {
        System.out.println("папа мыл раму");
    }

    public void printString(String a) {
        System.out.println(a);
    }

    public void printMamaString(String a) {
        System.out.println("мама мыла " + a);
    }
}
