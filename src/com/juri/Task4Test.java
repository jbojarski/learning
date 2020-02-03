package com.juri;

import org.junit.jupiter.api.Test;


class Task4Test {

    @Test
    void quadraticEquations() {

        Task4 task4 = new Task4();

        String result = task4.quadraticEquations(3, 4, 5);
        assert result == null;

        String result2 = task4.quadraticEquations(1, -2, -3);
        assert result2.equals("3.0;-1.0");

        String result3 = task4.quadraticEquations(1, 12, 36);
        assert result3.equals("-6.0");
    }
}