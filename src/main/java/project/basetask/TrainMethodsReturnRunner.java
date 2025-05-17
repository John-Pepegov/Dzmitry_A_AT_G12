package project.basetask;

public class TrainMethodsReturnRunner {
    // создать класс TrainMethodsReturnRunner с методом main, в котором создать объект класса TrainMethodsReturn
    // отпечатать в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул " и возвращаемое значение
    public static void main(String[] args) {
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();

        System.out.println("метод returnNewInt вернул: " + trainMethodsReturn.returnNewInt(10));

        System.out.println("метод returnNewLong вернул: " + trainMethodsReturn.returnNewLong(9223372036854775807L));

        System.out.println("метод returnNewChar вернул: " + trainMethodsReturn.returnNewChar('W'));

        System.out.println("метод returnNewFloat вернул: " + trainMethodsReturn.returnNewFloat(3.12f));

        System.out.println("метод returnNewDouble вернул: " + trainMethodsReturn.returnNewDouble(2.718281828));

        System.out.println("метод returnNewShort вернул: " + trainMethodsReturn.returnNewShort((short) 32000));

        System.out.println("метод returnNewByte вернул: " + trainMethodsReturn.returnNewByte((byte) 100));

        System.out.println("метод returnNewBoolean вернул: " + trainMethodsReturn.returnNewBoolean(true));
    }
}
