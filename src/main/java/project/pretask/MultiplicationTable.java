package project.pretask;

public class MultiplicationTable {
    //класс MultiplicationTable, используя цикл for, выведите на экран таблицу умножения для числа 5 (1  5, 2  5, и так далее);
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + 5 * i);
        }
    }
}
