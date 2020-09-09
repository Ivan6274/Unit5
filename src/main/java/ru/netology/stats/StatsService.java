package ru.netology.stats;


import java.util.Arrays;

public class StatsService {
    public int calculateSumSells(String[] args) {
        int[] staticArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        for (int i = 0; i < 12; i++) {

        }
        System.out.println(Arrays.toString(staticArray));
        int sumArray = 0;
        for (int i = 0; i < staticArray.length; i++) {
            sumArray += staticArray[i];
        }
        return sumArray;
    }

    public int calculateAverageSells(String[] args) {
        int[] staticArray1 = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sumArray1 = 0;
        for (int l = 0; l< staticArray1.length; l++) {
            sumArray1 += staticArray1[l];

            int averageSells = (sumArray1 / staticArray1.length);
        }
        return averageSells;
    }


    public int calculateIndexOfMinSells(String[] args) {
        int[] staticArray2 = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int indexOfMin = 0;
        double min = staticArray2[0];
        for (int i = 0; i < staticArray2.length; i++) {
            if (staticArray2[i] < staticArray2[0]) {
                min = staticArray2[i];
                indexOfMin = i + 1;

            }
            return indexOfMin;
        }
    }
    public int calculateIndexOfMaxSells(String[] args) {
        int[] staticArray3 = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int indexOfMax = 0;
        int max = staticArray3[0];
        for (int i = 0; i < staticArray3.length - 1; i++) {
            if (staticArray3[i] > staticArray3[i + 1]) {
                max = staticArray3[i];
                indexOfMax = i + 1;
            }
            return indexOfMax;

        }
    }

    public int calculateMinSumSellsIndex(String[] args) {
                int[] staticArray4 = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
                int minSumSellIndex = 0;
                int sumArray1 = 0;
                for (int i = 0; i < staticArray4.length; i++) {
                    sumArray1 += staticArray4[i];

                    int averageSells = (sumArray1 / staticArray4.length);
                    for (int j = 0; j < staticArray4.length; j++) {
                        if (averageSells > staticArray4[j]) {
                            minSumSellIndex++;

                        }
                        return minSumSellIndex;
                    }


                    int maxSumSellIndex = 0;
                    for (int k = 0; k < staticArrayh4.length; k++) {
                        if (average < staticArray4[k]) {
                            maxSumSellIndex++;

                        }

                    }

                }
            }
