package com.juri;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task5Test {

    @Test
    public void decToBin() {

        Task5 task5 = new Task5();

        Assert.assertEquals(task5.decToBin(10), "1010");
        Assert.assertEquals(task5.decToBin(1), "1");
        Assert.assertEquals(task5.decToBin(3), "11");
        Assert.assertEquals(task5.decToBin(15), "1111");
    }
}