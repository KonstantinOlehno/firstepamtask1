package by.olehno.array.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayParserStream {
    private static final String SPLIT_REGEX = "(\\s?+-\\s?+)|(,\\s?+)";

    public static List<Integer> strToInt(String line) {
        List<Integer> intList = new ArrayList<>();
        String[] arrayStr = line.split(SPLIT_REGEX);
        intList = Stream.of(arrayStr)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        return intList;
    }
}
