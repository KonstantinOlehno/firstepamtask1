package by.olehno.array.sort.impl;

import by.olehno.array.entity.CustomArray;
import by.olehno.array.sort.ArraySort;
import by.olehno.array.util.Logging;
import org.apache.logging.log4j.Level;

public class ArraySortImpl implements ArraySort {

    public static int partition(CustomArray customArray, int low, int high) {
        int[] array = customArray.getArray();
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (array[j] < pivot) {
                i++;

                int temp = array[i];

                array[i] = array[j];

                array[j] = temp;

            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    @Override
    public int[] bubbleSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        Logging.getLogger().log(Level.INFO, "Bubble sort " + customArray.toString());
        return array;
    }

    @Override
    public int[] selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
        Logging.getLogger().log(Level.INFO, "Selection sort " + customArray.toString());
        return array;
    }

    @Override
    public int[] quickSort(CustomArray customArray, int low, int high) {
        int[] array = customArray.getArray();

        if (low < high) {

            int pi = partition(customArray, low, high);

            quickSort(customArray, low, pi - 1);

            quickSort(customArray, pi + 1, high);
        }
        Logging.getLogger().log(Level.INFO, "Quick sort " + customArray.toString());

        return array;
    }
}

