package ru.netology.stats;

import java.util.Arrays;

public class Statservice1 {
    public int calculateSumSells( int[] staticArray) {


        int sumArray = 0;
        for (int i = 0; i < staticArray.length; i++) {
            sumArray += staticArray[i];
        }
        return sumArray;
    }
}
