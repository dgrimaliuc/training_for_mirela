package figure;


public class Circle extends Figure{
    public Circle (int radius)
    {
    }

    double r;
    private int perimeter (int r){
        int perimeter=0;
        //perimeter = (int) (a+b+c);
        return perimeter;
    }

    private double area (double r){
        int area=1;
        //double is not accepted?
        area = (int) (3.14 * (r*r));
        return area;
    }
    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
