package by.olehno.array.service.impl;

import by.olehno.array.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayFindServiceImplTest {

    static CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});

    @Test
    public void testFindMaxElement() {
        ArrayFindServiceImpl arrayFindService = new ArrayFindServiceImpl();
        int actual = 5;
        int expected = arrayFindService.FindMaxElement(customArray);
        Assert.assertEquals(actual, expected, 0);

    }


    @Test
    public void testFindMinElement() {
        ArrayFindServiceImpl arrayFindService = new ArrayFindServiceImpl();
        int actual = 1;
        int expected = arrayFindService.FindMinElement(customArray);
        Assert.assertEquals(actual, expected, 0);
    }

    @Test
    public void testFindAverageValue() {
        ArrayFindServiceImpl arrayFindService = new ArrayFindServiceImpl();
        double actual = 3.0;
        double expected = arrayFindService.FindAverageValue(customArray);
        Assert.assertEquals(actual, expected, 0.01);
    }

    @Test
    public void testFindSumElements() {
        ArrayFindServiceImpl arrayFindService = new ArrayFindServiceImpl();
        int actual = 15;
        int expected = arrayFindService.FindSumElements(customArray);
        Assert.assertEquals(actual, expected, 0);
    }

    @Test
    public void testCountPositiveElement() {
        ArrayFindServiceImpl arrayFindService = new ArrayFindServiceImpl();
        int actual = 5;
        int expected = arrayFindService.CountPositiveElement(customArray);
        Assert.assertEquals(actual, expected, 0);
    }

    @Test
    public void testCountNegativeElement() {
        ArrayFindServiceImpl arrayFindService = new ArrayFindServiceImpl();
        int actual = 0;
        int expected = arrayFindService.CountNegativeElement(customArray);
        Assert.assertEquals(actual, expected, 0);
    }
}