package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[]sales) {
        int sum = 0;
        for(int sale : sales){
            sum += sale;
        }
        return sum;
    }
    public int calculateAvg(int[]sales){
        return calculateSum(sales) / sales.length;
    }
    public int maxSaleMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int minSaleMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int numberOfMonthsBelowAvg(int[] sales){
        int avg = calculateAvg(sales);
        int monthsnumber = 0;
        for (int sale : sales){
            if (sale < avg){
                monthsnumber++;
            }
        }
        return monthsnumber;
    }
    public int numberOfMonthsAboveAvg(int[] sales){
        int avg = calculateAvg(sales);
        int monthsnumber = 0;
        for (int sale : sales){
            if (sale > avg){
                monthsnumber++;
            }
        }
        return monthsnumber;
    }

}
