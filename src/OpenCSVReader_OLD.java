import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class OpenCSVReader_OLD {

    public OpenCSVReader_OLD(){

    }
    private static final String csvFilePath ="Users.csv";

    public static void main(String[] args){
        try(
                Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
                CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
                ) {
            List<String[]> r = csvReader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
            System.out.println("test");
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }
}
