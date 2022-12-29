package student_loops_names;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import student_loops_names.interfaces.Communicable;
import student_loops_names.interfaces.Dressable;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Arrays;

public class Student implements Communicable, Dressable, Serializable {

    private final String firstName;
    private final String lastName;
    private int age;
    private int weight;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = new SecureRandom().nextInt(5) + 15;
        this.weight = new SecureRandom().nextInt(20) + 50;
    }

    public Student() {
        final Name random = new Faker().name();
        firstName = random.firstName();
        lastName = random.lastName();
        age = 18;
        weight = 70;

    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public void saySomething(String... words) {
        System.out.println("Hi user!" + Arrays.toString(words));
    }

    @Override
    public String toString() {
        return this.getFullName() + " weight: " + weight + ", age: " + age;
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
            return this + " is dressed in : " + val.replace(val.length() - 2, val.length(), "");
        }
    }
}

