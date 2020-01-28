package com.juri;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

        Random rnd = new Random(); // генератор случайных чисел

        int[] array = new int[50];      // массив из 50-ти элементов

        for (int i = 0; i < array.length; i++) {
            int nextRandomInt = rnd.nextInt(100); // получение случайного числа в пределах от 0 до 100
            array[i] = nextRandomInt;        // инициализация элемента массива
        }

        // 1) распечатать через запятую все элементы массива (в одну строчку)
        // 2) создать новый массив и заполнить его значениями из первого массива в обратном порядке
        // 3) найти среднее значение элементов первого массива


    }


}
