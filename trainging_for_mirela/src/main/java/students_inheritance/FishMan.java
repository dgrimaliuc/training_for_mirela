package students_inheritance;

public class FishMan extends UngraduatedStudents{
    public FishMan ()
    {
        this(5);
    }
    int value;

    public FishMan(int value)
    {
        super(5);
        this.value = value;
    }
}
