package project.basetask;

public class TrainMethodsStringRunner {
    //создать класс TrainMethodsStringRunner с методом main, в этом методе создать объект класса TrainMethodsString и вызвать всего его методы
    public static void main(String[] args) {
        TrainMethodsString trainMethodsString = new TrainMethodsString();

        trainMethodsString.printMama();
        trainMethodsString.printPapa();
        trainMethodsString.printString("пол");
        trainMethodsString.printMamaString("пол");
    }
}
