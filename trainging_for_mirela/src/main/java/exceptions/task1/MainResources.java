package exceptions.task1;

public class MainResources {
    public static void main(String[] args) {
        FileResource res = null;
        try {
            res = new FileResource();
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            res.close();
            System.out.println(res.isOpen);
        }

        try(FileResource fr = new FileResource()){
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


