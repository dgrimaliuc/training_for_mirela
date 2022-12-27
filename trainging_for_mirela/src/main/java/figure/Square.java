package figure;

import static java.lang.Math.pow;

public class Square extends Figure {

    int a;

    public Square(int a) {

        this.a = a;
    }


    @Override
    public double getPerimeter() {

        return a * 4;
    }

    @Override
    public double getArea() {

        return pow(a,2);
    }

    @Override
    public String toString() {
        return "The perimeter length of the square is: " + getPerimeter() + "\nThe area length of the square is: " + getArea();
    }
}
