package figure;

public class Triangle extends Figure {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        checkParameters(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkParameters(double a, double b, double c) {
       if (!(a + b >= c && a + c >= b && b + c >= a)){
           throw new RuntimeException("Invalid Triangle");
       }
    }


    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return s * (s - a) * (s - b) * (s - c);
    }

    @Override
    public String toString() {
        return "The perimeter length of the triangle is: " + getPerimeter() + "\nThe area length of the triangle is:" + getArea();
    }

}


