package by.olehno.array.reader;

import by.olehno.array.entity.CustomArray;
import by.olehno.array.exception.ReaderException;
import by.olehno.array.parser.ArrayParser;
import by.olehno.array.util.Logging;
import by.olehno.array.validator.impl.ArrayValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayReader {
    private static final String ARRAY_FILE_PATH = "src/main/java/by/olehno/array/file/text.txt";
    private static final ArrayValidatorImpl validator = new ArrayValidatorImpl();
    private static final String SPLIT_REGEX = "\\s|;\\s|,|-\\s";
    static final Logger logger = LogManager.getLogger();
    static ArrayParser parser = new ArrayParser();


    public List<Integer> CustomArrayReader() throws ReaderException {
        List<Integer> integerList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARRAY_FILE_PATH))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] srtArray = line.split(SPLIT_REGEX);
                if (validator.isValid(line)) {
                    int[] intArray = parser.parseToInt(srtArray);
                    CustomArray customArray = new CustomArray(intArray);
                    Arrays.asList(customArray, integerList);
                }
            }
        } catch (IOException e) {
            throw new ReaderException();
        }
        Logging.getLogger().log(Level.INFO, "Read from file text: " + integerList.toString());
        return integerList;
    }
}

