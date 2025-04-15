package project.basetask;

public class TrainMethodsPrimitiveRunner {
    //создать класс TrainMethodsPrimitiveRunner с методом main, в этом методе создать объект класса TrainMethodsPrimitive и вызвать всего его методы
    public static void main(String[] args) {
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();

        trainMethodsPrimitive.printInt(42);
        trainMethodsPrimitive.printLong(9223372036854775807L);
        trainMethodsPrimitive.printChar('W');
        trainMethodsPrimitive.printFloat(3.12f);
        trainMethodsPrimitive.printDouble(2.718281828);
        trainMethodsPrimitive.printShort((short) 32000);
        trainMethodsPrimitive.printByte((byte) 100);
        trainMethodsPrimitive.printBoolean(true);
    }
}
