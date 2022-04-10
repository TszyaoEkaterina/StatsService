package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void shouldCalculateSum(){
        StatsService service = new StatsService();
            int expected = 180;
            int actual = service.calculateSum(sales);
            assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateAvg(){
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calculateAvg(sales);
        assertEquals(expected, actual);
    }
    @Test
    void fixMaxSaleMonth(){
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSaleMonth(sales);
        assertEquals(expected, actual);
    }
    @Test
    void fixMinSaleMonth(){
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSaleMonth(sales);
        assertEquals(expected, actual);
    }
    @Test
    void fixNumberOfMonthsBelowAvg(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberOfMonthsBelowAvg(sales);
        assertEquals(expected, actual);
    }
    @Test
    void fixNumberOfMonthsAboveAvg(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberOfMonthsAboveAvg(sales);
        assertEquals(expected, actual);
    }


}