package homework.generics;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> obj1 = new GenericMethodsInGenericClassTwoParams<String, String>();
        System.out.println(obj1.genericMethodGenArgs("hello"));
        System.out.println(obj1.genericMethodGenArgs("hello", "world"));
        obj1.genericMethodHalfGenArgs("hello", "example");
        obj1.genericMethodHalfGenArgs("hello", "world", "example123");

        System.out.println("----");

        GenericMethodsInGenericClassTwoParams<String, Integer> obj2 = new GenericMethodsInGenericClassTwoParams<String, Integer>();
        System.out.println(obj2.genericMethodGenArgs("text"));
        System.out.println(obj2.genericMethodGenArgs("text", 123));
        obj2.genericMethodHalfGenArgs("text", "data");
        obj2.genericMethodHalfGenArgs("text", 123, "mixed types");

        System.out.println("----");

        GenericMethodsInGenericClassTwoParams<String, Double> obj3 = new GenericMethodsInGenericClassTwoParams<String, Double>();
        System.out.println(obj3.genericMethodGenArgs("val"));
        System.out.println(obj3.genericMethodGenArgs("val", 3.14));
        obj3.genericMethodHalfGenArgs("val", "pi");
        obj3.genericMethodHalfGenArgs("val", 3.14, "boop");

        System.out.println("----");

        GenericMethodsInGenericClassTwoParams<Integer, Integer> obj4 = new GenericMethodsInGenericClassTwoParams<Integer, Integer>();
        System.out.println(obj4.genericMethodGenArgs(1));
        System.out.println(obj4.genericMethodGenArgs(1, 2));
        obj4.genericMethodHalfGenArgs(100, "hundred");
        obj4.genericMethodHalfGenArgs(100, 200, "numbers");
    }
}