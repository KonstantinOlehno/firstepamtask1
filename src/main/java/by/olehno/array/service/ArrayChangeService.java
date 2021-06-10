package by.olehno.array.service;

import by.olehno.array.utils.Logging;
import org.apache.logging.log4j.Level;

public class ArrayChangeService {
    public void ChangeElement (int[] array){
        Logging.getLogger().log(Level.INFO,"Изменение элементов массива ");
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 1){
                array[i] = -1;
            }
        }
    }
}
