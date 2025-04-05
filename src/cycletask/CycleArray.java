package cycletask;

import java.util.Arrays;
import java.util.Random;

public class CycleArray {
    //создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)

    private int n;

    public CycleArray(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] generateArray() {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        return arr;
    }

    public void printArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
    }

    public void printArrayRevers(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = copy.length - 1; i >=0 ; i--) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
    }

    public void printArrayElementsMultiplied(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length; i++) {
            copy[i] = copy[i] * 5;
            System.out.print(copy[i] + " ");
        }
        System.out.println();
    }

    public void printArrayElementsSquared(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length; i++) {
            copy[i] = copy[i] * copy[i];
            System.out.print(copy[i] + " ");
        }
        System.out.println();
    }

    public void printMinElement(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length; i++) {
            copy[i]
        }
        System.out.println();
    }


}
