package by.olehno.array.reader;

import by.olehno.array.exception.ReaderException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ArrayReaderStream {
   static final Logger logger = LogManager.getLogger();

   public static List<String> reader (String filePath) throws ReaderException{
//       try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
//           List<String> list = new ArrayList<>();
//           do {
//               String line = bufferedReader.readLine();
//               list.add(line);
//           }while (bufferedReader.ready());

       try{
           return Files.readAllLines(Paths.get(filePath));
       }catch (IOException e){
           logger.log(Level.ERROR,"File not found: " + e);
           throw new ReaderException();
       }
   }
}

