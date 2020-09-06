package ru.netology.stats;


import java.util.Arrays;

public class StatsService {
    public static void main(String[] args) {
        int[] staticArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        for (int i = 0; i < 12; i++) {

        }
        System.out.println(Arrays.toString(staticArray));
        double sumArray = 0;
        for (int i = 0; i < staticArray.length; i++) {
            sumArray += staticArray[i];

        }
        System.out.println("Сумма продаж за год = " + sumArray);
        float average = (float) (sumArray / staticArray.length);
        System.out.println("Среднее значение продаж за год = " + average);

        int indexOfMin = 0;
        double min = staticArray[0];
        for (int i = 0; i < staticArray.length; i++) {
            if (staticArray[i] < staticArray[0]) {
                min = staticArray[i];
                indexOfMin = i + 1;

            }

        }
        System.out.println("В месяце под номером '" + indexOfMin + "' были Мин продажи равные = " + min);

        int indexOfMax = 0;
        double max = staticArray[0];
        for (int i = 0; i < staticArray.length - 1; i++) {
            if (staticArray[i] > staticArray[i + 1]) {
                max = staticArray[i];
                indexOfMax = i + 1;
            }

        }
        System.out.println("В месяце под номером '" + indexOfMax + "' были Макс продажи равные = " + max);


        int minSumSellIndex = 0;
        for (int i = 0; i < staticArray.length; i++) {
            if (average > staticArray[i]) {
                minSumSellIndex++;

            }

        }
        System.out.println("Количество месяцев с продажами меньше среднего равно = "+ minSumSellIndex);

        int maxSumSellIndex = 0;
        for (int i = 0; i < staticArray.length; i++) {
            if (average < staticArray[i]) {
                maxSumSellIndex++;

            }

        }
        System.out.println("Количество месяцев с продажами больше среднего равно = "+ maxSumSellIndex);
    }
}
