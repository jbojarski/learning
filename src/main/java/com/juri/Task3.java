package com.juri;

public class Task3 {
    // вывести все числа от 1000 до -1000 с шагом 25

    public void task() {

        for (int i = 1000; i >= -1000; i--) {
            if (i % 25 == 0) {
                System.out.println(i + ", ");

            }
        }
    }


}
