package project.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        Cycle1 cycle1 = new Cycle1();
        cycle1.Method1();
        System.out.println("---");

        Cycle2 cycle2 = new Cycle2();
        cycle2.Method2();
        System.out.println("---");

        CycleArray cycleArray1 = new CycleArray(7);
        int[] testArr = cycleArray1.generateArray();

        cycleArray1.printArray(testArr);
        System.out.println("---");

        cycleArray1.printArrayRevers(testArr);
        System.out.println("---");

        cycleArray1.printArrayElementsMultiplied(testArr);
        System.out.println("---");

        cycleArray1.printArrayElementsSquared(testArr);
        System.out.println("---");

        cycleArray1.printMinElement(testArr);
        System.out.println("---");

        cycleArray1.printSwitchedArray(testArr);
        System.out.println("---");

        cycleArray1.printArraySortedDescending(testArr);
    }
}