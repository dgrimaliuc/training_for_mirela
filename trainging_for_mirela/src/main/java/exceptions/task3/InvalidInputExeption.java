package exceptions.task3;

public class InvalidInputExeption extends Exception{
    InvalidInputExeption(String line) {
        super("Line contains non-integer values " + line);}
}
