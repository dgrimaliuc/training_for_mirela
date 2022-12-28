package exceptions.task1;

import exceptions.task3.InvalidFileExeption;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public static String readFileAsString(String fileName) throws InvalidFileExeption {
        String data;
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            throw new InvalidFileExeption(e, fileName);
        }
        return data;
    }
}
