package figure;

import java.util.Scanner;

public class Triangle<a, b, c> extends Figure{

    public Triangle(int width, int length, int height) {
        setWidth(width);
        setLength(length);
        setRadius(0);
        setHeight(height);
    }

    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

      double a, b, c;

        System.out.print("The value for a = ");
        a = console.nextInt();
        System.out.print("The value for b = ");
        b = console.nextInt();
        System.out.print("The value for c = ");
        c = console.nextInt();
        System.out.print("The value for height = ");
        // = console.nextInt();


     if ((checkValidity(a, b, c)) == 1)
         System.out.print("Valid Triangle");
     else
         System.out.print("Invalid Triangle");


        System.out.println("The perimeter of the triangle is: " + perimeter(a,b,c));
        System.out.println("The area of the triangle is: " + perimeter(a,b,c));
    }



    public static int checkValidity(double a, double b, double c)
    {
        if (a + b <= c || a + c <= b || b + c <= a)
            return 0;
        else
            return 1;
    }
    public static int perimeter(double a, double b, double c)
    {
        int perimeter=0;
        perimeter = (int) (a+b+c);
        return perimeter;
    }

    public static int area(double a, double b, double c)
    {
        int area=1;
        //area = (int) (s*(s-a)*(s-b)*(s-c));
        return area;
    }
}

