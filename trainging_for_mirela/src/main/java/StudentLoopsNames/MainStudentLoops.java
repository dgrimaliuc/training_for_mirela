package StudentLoopsNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainStudentLoops {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        //Student student1 = new Student("John", "Smith");

            for (int i=0; i<10; i++){
                students.add(new Student());
            }

        System.out.println("\nFirst Name of Students: ");
        for (Student student : students) {
            System.out.println(student.getFirstName());
        }
        System.out.println("\nLast Name of Students: ");
        for (Student student : students) {
            System.out.println(student.getLastName());
        }
        System.out.println("\nFull Name of Students: ");
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }
}
