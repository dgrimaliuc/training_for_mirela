package figure;
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 3, 5);
        Square square = new Square(2);
        Circle circle = new Circle(3);
        Cube cube = new Cube(7);

        System.out.println(triangle);
        System.out.println(square);
        System.out.println(circle);
        System.out.println(cube);
    }
}