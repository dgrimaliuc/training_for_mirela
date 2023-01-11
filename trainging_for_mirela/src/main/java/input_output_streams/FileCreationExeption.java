package input_output_streams;

import java.io.File;

public class FileCreationExeption extends Exception{

    FileCreationExeption(File fileName){
        super("The output file can't be created: " + fileName);
    }

}
