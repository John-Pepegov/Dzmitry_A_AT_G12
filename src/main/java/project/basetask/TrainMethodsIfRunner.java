package project.basetask;

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        // создать класс TrainMethodsIfRunner с методом main, в котором создать обьект класса TrainMethodsIf,
        // и отпечатать в консоль значение, возвращаемое каждым из его методов
        // в виде "метод <название метода> вернул " и возвращаемое значение, последний метод просто вызвать

        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();

        System.out.println("метод returnNewInt вернул: " + trainMethodsIf.returnNewInt(10));

        System.out.println("метод returnNewLong вернул: " + trainMethodsIf.returnNewLong(9223372036854775807L));

        System.out.println("метод returnNewChar вернул: " + trainMethodsIf.returnNewChar('W'));

        System.out.println("метод returnNewFloat вернул: " + trainMethodsIf.returnNewFloat(3.12f));

        System.out.println("метод returnNewDouble вернул: " + trainMethodsIf.returnNewDouble(400.718281828));

        trainMethodsIf.returnNewBoolean(false);
    }
}
