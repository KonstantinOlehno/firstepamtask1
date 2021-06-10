package by.olehno.array.service;

import by.olehno.array.entity.CustomArray;

public class ArrayChangeService {
    public void ChangeElement (int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 1){
                array[i] = -1;
            }
        }
    }
}
