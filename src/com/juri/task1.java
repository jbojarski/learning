

package com.juri;

// todo: 22.01
// написать программу поиска всех трёхзначных чисел, которые деляться на 11
// вывести их все на консоль и посчитать их кол-во
public class task1 {
    public static void main(String[] args) {

        // int count = calc(99, 99999, 9);

        // System.out.println(">>> count: " + count);

        int total2 = calc2(99, 9999, 11);
        int total1 = calc(99, 9999, 11);


         if (total1 - total2 != 0) {
             System.out.println(">>>> ERROR");
         } else {
             System.out.println(">>> DONE");
         }

    }

    private static int calc2(int minVal, int maxVal, int dev) {
        int i = minVal;

        int countDev = 0;

        do {
            if (i % dev == 0) {
                countDev = countDev + 1;
            }
            i++;

        } while (i < maxVal);


        return countDev;
    }

    private static int calc(int minVal, int maxVal, int dev) {
        int count = 0;
        long startTime = System.currentTimeMillis();

        for (int i = minVal; i < maxVal; i++) {
            if (i % dev == 0) {
                count++;
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println(">>> elapsed time: " + (endTime - startTime));

        return count;
    }

}
