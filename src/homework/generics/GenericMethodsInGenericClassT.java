package homework.generics;

public class GenericMethodsInGenericClassT<T> {
    public void genericMethodOneGenArg(T t) {
        System.out.println("I am an object of " + t.getClass().getSimpleName() + " class");
    }

    public <A, B> String genericMethodTwoGenArgs(A a, B b) {
        return "We are objects of " + a.getClass().getSimpleName() + " class and " + b.getClass().getSimpleName() + " class";
    }

    public <C> void genericMethodHalfGenArgs(C c, String s) {
        System.out.println("I got an object of " + c.getClass().getSimpleName()
                + " class and string with " + s.length() + " characters");
    }
}
