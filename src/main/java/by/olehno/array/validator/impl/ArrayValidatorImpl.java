package by.olehno.array.validator.impl;

import by.olehno.array.util.Logging;
import org.apache.logging.log4j.Level;

public class ArrayValidatorImpl {
    private static final String MATCHER_REGEX = "(\\d+((\\s?+,)|(\\s?+-))\\s+)+(\\d+\\s?+)";

    public static boolean isValid(String line) {
        return line.matches(MATCHER_REGEX);
    }
}
