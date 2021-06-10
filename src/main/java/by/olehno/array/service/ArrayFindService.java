package by.olehno.array.service;

import by.olehno.array.utils.Logging;
import org.apache.logging.log4j.Level;

public class ArrayFindService {
    public int FindMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        Logging.getLogger().log(Level.INFO, "Наибольшее значение массива " + max);
        return max;
    }

    public int FindMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        Logging.getLogger().log(Level.INFO, "Наименьшее значение массива " + min);
        return min;
    }

    public double FindAverageValue(int[] array) {
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        Logging.getLogger().log(Level.INFO, "Среднее значение элементов массива " + average);
        return average;
    }

    public int FindSumElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        Logging.getLogger().log(Level.INFO, "Сумма элементов массива " + sum);
        return sum;
    }

    public int CountPositiveElement(int[] array) {
        int positive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }

        }
        Logging.getLogger().log(Level.INFO, "Количество положительных элементов массива " + positive);
        return positive;
    }

    public int CountNegativeElement(int[] array) {
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative++;
            }

        }
        Logging.getLogger().log(Level.INFO, "Количество отрицательных элементов массива " + negative);
        return negative;
    }
}
