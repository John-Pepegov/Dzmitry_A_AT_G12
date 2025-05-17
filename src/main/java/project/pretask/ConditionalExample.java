package project.pretask;

public class ConditionalExample {
    //класс ConditionalExample, объявите целочисленную переменную и используйте условный оператор if, чтобы проверить, больше ли она 10;
    //выведите результат проверки на экран;
    public static void main(String[] args) {
        int a = 1;
        if (a > 10) {
            System.out.println(a + " > 10");
        } else {
            System.out.println(a + " <= 10");
        }
    }
}