package input_output_streams;

import java.io.File;
import java.io.IOException;

public class InvalidFileExeption extends Exception {

    public InvalidFileExeption(File fileName) {
        super("File not found: " + fileName);
    }
}

