package exceptions;

public class Resource implements AutoCloseable {

    public boolean isOpen;

    Resource() {
        isOpen = true;
    }


    @Override
    public void close() {
        isOpen = false;
        System.out.println("Resource closed");
    }
}
