package by.olehno.array.sort.impl;

import by.olehno.array.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortImplTest {
    static CustomArray customArray = new CustomArray(new int[]{1, 3, 7, 8, 4});

    @Test
    public void testBubbleSort() {
        ArraySortImpl arraySort = new ArraySortImpl();
        int[] actual = new int[]{1, 3, 4, 7, 8};
        int[] expected = arraySort.bubbleSort(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        ArraySortImpl arraySort = new ArraySortImpl();
        int[] actual = new int[]{1, 3, 4, 7, 8};
        int[] expected = arraySort.selectionSort(customArray);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testQuickSort() {
        ArraySortImpl arraySort = new ArraySortImpl();
        int[] actual = new int[]{1, 3, 4, 7, 8};
        int[] expected = arraySort.quickSort(customArray,0,customArray.getArray().length-1);
        Assert.assertEquals(actual, expected);
    }
}