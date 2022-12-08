package StudentLoopsNames;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class Student {

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
}
