package figure;

public class Triangle extends Figure{

    double a, b, c;

    public Triangle(double a, double b, double c) {
        checkValidity(a,b,c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void checkValidity(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.print("Invalid Triangle");
        else
            System.out.print("Valid Triangle");
    }

    @Override
    public int getPerimeter() {
        int perimeter = (int) (a+b+c);
        System.out.println("\nThe perimeter of the triangle is: " + perimeter);
        return perimeter;
    }


    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        double area = (double) (s*(s-a)*(s-b)*(s-c));
        System.out.println("\nThe area of the triangle is: " + area);
        return area;
    }
}


