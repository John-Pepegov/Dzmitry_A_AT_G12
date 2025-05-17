package homework.generics;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> stringObj = new GenericMethodsInGenericClassT<>();
        stringObj.genericMethodOneGenArg("hello");
        String result1 = stringObj.genericMethodTwoGenArgs("Bob", 32);
        System.out.println(result1);
        stringObj.genericMethodHalfGenArgs(123, "Boop!");

        System.out.println("----");

        GenericMethodsInGenericClassT<Integer> intObj = new GenericMethodsInGenericClassT<>();
        intObj.genericMethodOneGenArg(123);
        System.out.println(intObj.genericMethodTwoGenArgs(42, 3.14));
        intObj.genericMethodHalfGenArgs("99", "test123");

        System.out.println("----");

        GenericMethodsInGenericClassT<Double> doubleObj = new GenericMethodsInGenericClassT<>();
        doubleObj.genericMethodOneGenArg(3.1415);
        System.out.println(doubleObj.genericMethodTwoGenArgs(1.1, "text"));
        doubleObj.genericMethodHalfGenArgs(2.2, "pi");
    }
}
