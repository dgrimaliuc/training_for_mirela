package student_loops_names;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import student_loops_names.interfaces.Communicable;
import student_loops_names.interfaces.Dressable;

import java.util.Arrays;

public class Student implements Communicable, Dressable {

    public static String schoolName;
    private final String firstName;
    private final String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
        final Name random = new Faker().name();
        firstName = random.firstName();
        lastName = random.lastName();

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void saySomething() {
        System.out.println("Hi user!");
    }

    public void saySomething(String s) {
        System.out.println("Hi user!");
    }

    public void saySomething(String ...words) {
        System.out.println("Hi user!" + Arrays.toString(words));
    }

    @Override
    public String toString() {
        return this.getFullName();
    }

    @Override
    public String communicate(String words) {
        return this + " said " + words;
    }

    @Override
    public String communicate(String words, Student student2) {
        return this + " said to " + student2 + ": " + words;
    }


    public String dress(String... args) {
        if (args.length == 0) {
            return "O la-la " + this + " is naked";
        } else {
            StringBuilder val = new StringBuilder();
            for (String studentClothes : args) {
                val.append(studentClothes.trim()).append(", ");
            }
            return this + " is dressed in : " + val.replace(val.length()-2,val.length(),"");
        }
    }
}


//List. of can be best used when data set is less and unchanged,
// while Arrays. asList can be used best in case of large and dynamic data set.
