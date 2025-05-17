package project.basetask;

public class TrainMethodsReturn {
    // создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это число умноженное на 3
    // создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
    // создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таких символов
    // создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает это число деленное на 2
    // создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает это число плюс 8
    // создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это число минус 1
    // создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2
    // создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и возвращает обратное булево

    public int returnNewInt(int x) {
        return x * 3;
    }

    public long returnNewLong(long x) {
        return x - 4;
    }

    public String returnNewChar(char x) {
        return "" + x + x;
    }

    public float returnNewFloat(float x) {
        return x / 2;
    }

    public double returnNewDouble(double x) {
        return x + 8;
    }

    public short returnNewShort(short x) {
        return (short) (x - 1);
    }

    public byte returnNewByte(byte x) {
        return (byte) (x * 2);
    }

    public boolean returnNewBoolean(boolean x) {
        return !x;
    }
}
