

package com.juri;

// todo: 22.01
// написать программу поиска всех трёхзначных чисел, которые деляться на 11
// вывести их все на консоль и посчитать их кол-во
public class task1 {
    public static void main(String[] args) {

        int count = calc(99, 99999, 9);


        int count2 = calc2(00, 99999, 9);

        if (count == count2) {
            System.out.println(">>> kõik on korras");
        } else
            System.out.println(">>> viga");


    }

    private static int calc(int minVal, int maxVal, int dev) {
        int count = 0;
        long startTime = System.currentTimeMillis();

        for (int i = minVal; i < maxVal; i++) {
            if (i % dev == 0) {
                System.out.println(i + " delitsa na 11");
                count++;
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println(">>> elapsed time: " + (endTime - startTime));

        return count;
    }


    private static int calc2(int minVal, int maxVal, int dev) {
        int count = 0;

        // todo:


        // use while or do-while loop for the same task
        return count;
    }
}
