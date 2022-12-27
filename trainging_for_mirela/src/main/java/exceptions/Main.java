package exceptions;

public class Main {

    public static void main(String[] args) {
        try (Resource res = new Resource()) {
            throw new MyPersonalException();


        } catch (Error | MyPersonalException e) {
            System.out.println(e.getMessage());
        }


    }
}
