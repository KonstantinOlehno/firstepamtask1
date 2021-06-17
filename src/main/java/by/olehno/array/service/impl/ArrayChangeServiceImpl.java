package by.olehno.array.service.impl;

import by.olehno.array.entity.CustomArray;
import by.olehno.array.service.ArrayChangeService;
import by.olehno.array.util.Logging;
import org.apache.logging.log4j.Level;

public class ArrayChangeServiceImpl implements ArrayChangeService {

    public int[] ChangeElement(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = -1;
            }
        }
        Logging.getLogger().log(Level.INFO, "Changing array elements " + customArray.toString());
        return array;
    }
}
