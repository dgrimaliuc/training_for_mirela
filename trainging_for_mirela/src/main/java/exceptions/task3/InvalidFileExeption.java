package exceptions.task3;

import java.io.IOException;

public class InvalidFileExeption extends Exception{

    public InvalidFileExeption(IOException e , String fileName){
        super("File not found "+ fileName,e);
    }
}
