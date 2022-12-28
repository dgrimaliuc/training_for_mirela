package exceptions.task3;

public class EmptyFileException extends Exception{

    EmptyFileException(String fileName) {
        super("The file is empty " + fileName);
    }
}
