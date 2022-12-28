package exceptions.task1;

import java.io.IOException;

public class FileResource implements AutoCloseable {

static{
    System.out.println("Static block");
}
    public boolean isOpen;

    FileResource(){
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Resource is closed");

    }
}
