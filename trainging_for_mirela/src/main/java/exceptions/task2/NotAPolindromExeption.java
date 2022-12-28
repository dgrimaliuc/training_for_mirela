package exceptions.task2;

public class NotAPolindromExeption extends Exception{

    NotAPolindromExeption(String word){
        super("Not a Polindrom: " + word);
    }
    NotAPolindromExeption(){
        super("Not a Polindrom prompted");
    }
}
