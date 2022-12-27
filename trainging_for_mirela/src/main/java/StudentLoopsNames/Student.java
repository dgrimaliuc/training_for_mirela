package StudentLoopsNames;

import StudentLoopsNames.interfaces.Communicable;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.Arrays;

public class Student implements Communicable {

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
    public String communicate(String words) {
        return getFullName() + " said " + words;
    }
}
