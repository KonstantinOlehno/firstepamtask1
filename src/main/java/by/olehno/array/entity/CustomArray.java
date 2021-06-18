package by.olehno.array.entity;

import java.util.Arrays;
import java.util.List;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray(List<Integer> arrayList) {
        int[] output = new int[arrayList.size()];
        for (int i = 0; i != arrayList.size(); i++) {
            output[i] = arrayList.get(i);
        }
        array = output;
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int a : array) {
            sb.append(a).append(" ");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o.getClass() != CustomArray.class) {
            return false;
        }
        CustomArray object = (CustomArray) o;
        return Arrays.equals(array, object.array);

    }
}
