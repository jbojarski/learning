package com.juri;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

        Random rnd = new Random(); // генератор случайных чисел

        int[] array = new int[10];     // массив из 50-ти элементов

        printArray(array);

        //1) распечатать через запятую все элементы массива (в одну строчку)
        for (int i = 0; i < array.length; i++) {
            int nextRandomInt = rnd.nextInt(200) - 100; // получение случайного числа в пределах от 0 до 100
            array[i] = nextRandomInt; // init
        }
        System.out.println();
        printArray(array);

        System.out.println();
        System.out.println();


        // 2) создать новый массив и заполнить его значениями из первого массива в обратном порядке

        int[] reverse = new int[array.length];
        for (int i = 0, j = reverse.length - 1; i < reverse.length; i++, j--) {
            reverse[j] = array[i];
        }

        printArray(reverse);

        int sum = 0;


        for (int i = 0; i < reverse.length; i++) {
            sum += reverse[i];
        }

        System.out.println("\n>>> sum: " + sum);
        System.out.println(">>> average: " + (sum / reverse.length));

        int maxVal = foundMaxValue(reverse);
        System.out.println(">>> max val: " + maxVal);

        int minVal = foundMinValue(reverse);
        System.out.println(">>> min val: " + minVal);


        // 1) распечатать через запятую все элементы массива (в одну строчку)
        // 2) создать новый массив и заполнить его значениями из первого массива в обратном порядке
        // 3) найти среднее значение элементов первого массива


    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
    }

    private static int foundMaxValue(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int foundMinValue(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
