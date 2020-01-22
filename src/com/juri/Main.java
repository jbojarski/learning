

package com.juri;

/**
 * 1) примитивные типы int, byte, float, long, double
 * 2) цикл for, while do
 * 3)
 */

public class Main {


    public static void main(String[] args) {

        for (int count = 100; count < 999; count++){

            if (count % 11 == 0) {
                System.out.println(count + " delitsa na 11");
            } else {
                System.out.println(count);
            }

        }

    }


        // todo: 22.01
        // написать программу поиска всех трёхзначных чисел, которые деляться на 11
        // вывести их все на консоль и посчитать их кол-во
}
