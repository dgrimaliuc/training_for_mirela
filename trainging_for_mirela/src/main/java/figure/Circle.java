package figure;

import java.awt.*;
import java.text.DecimalFormat;

import static java.lang.Math.PI;

public class Circle extends Figure {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return round(2 * PI * radius);
    }

    @Override
    public double getArea() {
        return round(PI * radius * radius);
    }

    private double round (double n){
        return Math.round(n * 100) / 100.0;
    }
    @Override
    public String toString() {
        return "The perimeter length of the circle is: " + getPerimeter()
                + "\nThe area length of the circle  is: " +  getArea();
    }

}
