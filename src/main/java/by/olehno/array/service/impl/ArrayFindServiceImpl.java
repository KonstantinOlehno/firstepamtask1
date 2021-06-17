package by.olehno.array.service.impl;

import by.olehno.array.entity.CustomArray;
import by.olehno.array.service.ArrayFindService;
import by.olehno.array.util.Logging;
import org.apache.logging.log4j.Level;

public class ArrayFindServiceImpl implements ArrayFindService {

    public int FindMaxElement(CustomArray customArray) {
        int[] array = customArray.getArray();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        Logging.getLogger().log(Level.INFO, "Max element: " + max);
        return max;
    }

    public int FindMinElement(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
        Logging.getLogger().log(Level.INFO, "Min element: " + min);
        return min;
    }

    public double FindAverageValue(CustomArray customArray) {
        int[] array = customArray.getArray();
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        Logging.getLogger().log(Level.INFO, "Average value: " + average);
        return average;
    }

    public int FindSumElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        Logging.getLogger().log(Level.INFO, "Sum of elements: " + sum);
        return sum;
    }

    public int CountPositiveElement(CustomArray customArray) {
        int[] array = customArray.getArray();
        int positive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }

        }
        Logging.getLogger().log(Level.INFO, "Number of positive elements: " + positive);
        return positive;
    }

    public int CountNegativeElement(CustomArray customArray) {
        int[] array = customArray.getArray();
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative++;
            }

        }
        Logging.getLogger().log(Level.INFO, "Number of negative elements: " + negative);
        return negative;
    }

}
