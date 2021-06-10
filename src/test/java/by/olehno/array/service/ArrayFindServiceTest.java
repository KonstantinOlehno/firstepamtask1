package by.olehno.array.service;

import by.olehno.array.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayFindServiceTest {

    @Test
    public void testFindMaxElement() {
        ArrayFindService arrayFindService = new ArrayFindService();
        CustomArray customArray = new CustomArray(new int[]{1,2,3,4,5});
        int actual = 5;
        int expected = arrayFindService.FindMaxElement(customArray);
        Assert.assertEquals(actual,expected,0);

    }
}