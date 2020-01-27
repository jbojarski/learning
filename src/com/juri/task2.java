package com.juri;

public class task2 {

    // !------!-----!------!---
    //  true   AND   true   =  ?
    //  false  AND   true   =  ?
    //  false  AND   false  =  ?
    //  true   OR    true   =  ?
    //  false  OR   true   =  ?
    //  false  OR   false  =  ?
    //  true   XOR   true   = ?
    //  true   XOR   false   = ?
    //  false   XOR   false   = ?
    //  false   XOR   true   = ?
    // !------!-----!------!---

    public static void main(String[] args) {

        // todo: calculate logical values

        int a = 10;
        int b = 20;
        int c = 20;

        // using true   AND   true
        if ((a < b) && (b == c)) {
            System.out.println("True");
        } else
            System.out.println("False");

        // using false   AND   true
        if ((a > b) && (b == c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using false   AND   false
        if ((a > b) && (b != c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using true   OR   true
        if ((a < b) || (b == c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using false   OR   true
        if ((a > b) || (b == c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using false   OR   false
        if ((a > b) || (b != c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using true   XOR   true
        if ((a < b) ^ (b == c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using true   XOR   false
        if ((a < b) ^ (b != c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using false   XOR   false
        if ((a > b) ^ (b != c)) {
            System.out.println("True");
        } else
            System.out.println("False");


        // using false   XOR   true
        if ((a > b) ^ (b == c)) {
            System.out.println("True");
        } else
            System.out.println("False");


    }


}
