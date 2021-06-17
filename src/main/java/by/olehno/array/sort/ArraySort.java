package by.olehno.array.sort;

import by.olehno.array.entity.CustomArray;

public interface ArraySort {

    public int[] bubbleSort(CustomArray customArray);

    public int[] selectionSort(CustomArray customArray);

    public int[] quickSort(CustomArray customArray, int low, int high );

}
