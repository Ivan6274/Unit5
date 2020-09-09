package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Statservice1Test {

    @Test
    int calculateSumSells() {
        Statservice1Test service = new Statservice1Test();

        int[] staticArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSumSells(staticArray);


        assertEquals(expected, actual);

        return expected;
    }
}