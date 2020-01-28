package com.juri;

public class Arrays {

    public static void main(String[] args) {


        int[] array = {9, 1, 2, 3, 4, 5, -4334};


        // System.out.println(">>> len: " + array.length);


        array[0] = 22;


        for (int i = 0; i < array.length; i++) {
            //  System.out.println(">>> " + array[i]);
        }

        boolean[] b = new boolean[10];

        for (int i = 0; i < b.length; i++) {
            System.out.println(">>> [" + i + "]  = " + b[i]);
        }


    }


}
