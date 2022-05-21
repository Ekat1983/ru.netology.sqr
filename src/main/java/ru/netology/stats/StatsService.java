package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long avg(long[] sales) {
        return sum(sales) / sales.length;

    }

    public int peakSales(long[] sales) {
        int peakMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[peakMonth]) {
                peakMonth = month;
            }
            month = month + 1;

        }
        return peakMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int aboveAvg(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

    public int higherAvg(long[] sales) {
        long avg = avg(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }
}


