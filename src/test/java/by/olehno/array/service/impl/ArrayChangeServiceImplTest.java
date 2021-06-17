package by.olehno.array.service.impl;

import by.olehno.array.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayChangeServiceImplTest {

    @Test
    public void testChangeElement() {
        ArrayChangeServiceImpl changeService = new ArrayChangeServiceImpl();
        CustomArray customArray = new CustomArray(new int[]{1,3,5,-2,-6});
        int[] actual = new int[] {-1,-1,-1,-2,-6};
        int[] expected = changeService.ChangeElement(customArray);

        Assert.assertEquals(actual,expected);
    }
}