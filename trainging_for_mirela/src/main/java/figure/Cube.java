package figure;

import static java.lang.Math.pow;

public class Cube extends Figure{

    double a;
    public Cube(double a)
    {
        this.a = a;
    }

    @Override
    public double getPerimeter() {

        return a * 12;
    }

    @Override
    public double getArea() {

        return 6 * pow(a,2);
    }

    @Override
    public String toString() {
        return "The perimeter length of the cube is: " + getPerimeter() + "\nThe area length of the cube is: " + getArea();
    }
}
