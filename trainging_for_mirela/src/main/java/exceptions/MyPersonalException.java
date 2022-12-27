package exceptions;

public class MyPersonalException extends Exception {
    MyPersonalException(String message) {
        super(message);
    }

    MyPersonalException(){
        super("Unknown error");
    }


}
