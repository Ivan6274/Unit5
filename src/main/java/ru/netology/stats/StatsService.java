package ru.netology.stats;


import java.util.Arrays;

public class StatsService {
    public int calculateSumSells(int[] staticArray){
        int sumArray = 0;
        for (int i = 0; i < staticArray.length; i++) {
            sumArray += staticArray[i];
        }
        return sumArray;
    }


    public int calculateAverageSells(int[] staticArray1) {


        int sumArray1 = 0;
        for (int l = 0; l < staticArray1.length; l++) {
            sumArray1 += staticArray1[l];

            int averageSells = (sumArray1 / staticArray1.length);
        }

        return averageSells;
    }


    public int calculateIndexOfMinSells(int[] staticArray2) {
        int indexOfMin = 0;
        double min = staticArray2[0];
        for (int i = 0; i < staticArray2.length; i++) {
            if (staticArray2[i] < staticArray2[0]) {
                min = staticArray2[i];
                indexOfMin = i + 1;

            }

        }
        return indexOfMin;
    }

    public int calculateIndexOfMaxSells(int[] staticArray3) {
        int indexOfMax = 0;
        int max = staticArray3[0];
        for (int i = 0; i < staticArray3.length - 1; i++) {
            if (staticArray3[i] > staticArray3[i + 1]) {
                max = staticArray3[i];
                indexOfMax = i + 1;
            }


        }
        return indexOfMax;
    }

    public int calculateMinSumSellsIndex(int[] staticArray4) {
        int minSumSellIndex = 0;
        int sumArray1 = 0;
        for (int i = 0; i < staticArray4.length; i++) {
            sumArray1 += staticArray4[i];

            int averageSells = (sumArray1 / staticArray4.length);
            for (int j = 0; j < staticArray4.length; j++) {
                if (averageSells > staticArray4[j]) {
                    minSumSellIndex++;
                }
            }
        }
        return minSumSellIndex;
    }


    public int calculateMaxSumSellsIndex(int[] staticArray5) {
        int maxSumSellIndex = 0;
        int sumArray1 = 0;
        for (int i = 0; i < staticArray5.length; i++) {
            sumArray1 += staticArray5[i];

            int averageSells = (sumArray1 / staticArray5.length);
            for (int j = 0; j < staticArray5.length; j++) {
                if (averageSells < staticArray5[j]) {
                    maxSumSellIndex++;
                }
            }
        }
        return maxSumSellIndex;
    }
}
