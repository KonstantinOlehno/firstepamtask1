package by.olehno.array.service;

public class ArrayFindService {
    public int FindMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    public int FindMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[0]) {
                min = array[i];
            }
        }
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
        return average;
    }

    public int FindSumElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public int CountPositiveElement(int[] array) {
        int positive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive++;
            }

        }
        return positive;
    }

    public int CountNegativeElement(int[] array) {
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative++;
            }

        }
        return negative;
    }
}
