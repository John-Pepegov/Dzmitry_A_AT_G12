package project.cycletask;

public class Cycle2 {
    //используя for вывести в консоль каждое нечетное число от 3 до 19 включительно

    public void Method2() {
        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
