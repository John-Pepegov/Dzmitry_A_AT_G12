package project.cycletask;

public class Cycle1 {
    //используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел

    public void Method1() {
        int i = 0;
        while (i <= 20) {
            System.out.print(i++ + " ");
        }
        System.out.println();
    }
}
