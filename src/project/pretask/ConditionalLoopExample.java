package project.pretask;

public class ConditionalLoopExample {
    //класс ConditionalLoopExample, используйте цикл for, чтобы вывести четные числа от 1 до 10, с использованием условного оператора if для пропуска нечетных чисел;
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
