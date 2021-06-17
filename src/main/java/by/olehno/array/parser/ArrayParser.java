package by.olehno.array.parser;

public class ArrayParser {

    public int[] parseToInt(String[] arrayStr) {
        int[] arrayInt = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            arrayInt[i] = Integer.parseInt(arrayStr[i]);
        }
        return arrayInt;
    }
}
