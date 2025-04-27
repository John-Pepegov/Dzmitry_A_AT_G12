package homework.generics;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
    public String genericMethodGenArgs(X x) {
        return "I received 1 arguments of type: " + x.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X x, Y y) {
        return "I received 2 arguments of type: " + x.getClass().getSimpleName() + " class, " + x.getClass().getSimpleName() + " class";
    }

    public void genericMethodHalfGenArgs(X x, String s) {
        System.out.println("I got an object of " + x.getClass().getSimpleName() + " class and string with " + s.length() + " characters");
    }

    public void genericMethodHalfGenArgs(X x, Y y, String s) {
        String classX = x.getClass().getSimpleName();
        String classY = y.getClass().getSimpleName();
        int length = s.length();
        System.out.println("I got an object of " + classX + " class and " + classY + " class and string with " + length + " characters");
    }
}
