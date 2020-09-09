package ru.netology.stats;

import java.util.Arrays;

public class Statservice1 {
    public int calculateSumSells(String[] args) {
        int[] staticArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        for (int i = 0; i < 12; i++) {

        }

        int sumArray = 0;
        for (int i = 0; i < staticArray.length; i++) {
            sumArray += staticArray[i];
        }
        return sumArray;
    }
}
