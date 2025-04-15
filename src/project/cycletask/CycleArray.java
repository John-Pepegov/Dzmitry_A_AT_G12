package project.cycletask;

import java.util.Arrays;
import java.util.Random;

public class CycleArray {
    //- создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)
    //- пройти по массиву и вывести в консоль все элементы
    //- вывести в консоль все элементы массива в обратном порядке
    //- каждый элемент массива умножить на 5 и вывести результат в консоль
    //- каждый элемент массива возвести в квадрат и вывести результат в консоль
    //- найти минимальный элемент массива и вывести результат в консоль
    //- поменять местами первый и последний элементы и вывести результат в консоль
    //- отсортировать элементы массива в порядке убывания (любым способом) и вывести результат в консоль

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
        for (int i = copy.length - 1; i >= 0; i--) {
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
        int minValue = copy[0];

        for (int i = 0; i < copy.length; i++) {
            if (copy[i] < minValue) {
                minValue = copy[i];
            }
        }
        System.out.println(minValue);
    }

    public void printSwitchedArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        int firstElement = copy[0];
        int lastElement = copy[copy.length - 1];

        copy[0] = lastElement;
        copy[copy.length - 1] = firstElement;

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
    }

    public void printArraySortedDescending(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        int x = 0;

        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - 1; j++) {
                if (copy[j] < copy[j + 1]) {
                    x = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = x;
                }
            }
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
    }
}
