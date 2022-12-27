package student_loops_names;

public class MainStudentLoops {
    public static void main(String... args) {

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(student1.communicate("Hi, sweety!", student2));
        System.out.println(student1.dress("pants", "jeans", "T-shirt"));

    }
}
