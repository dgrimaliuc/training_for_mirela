package iostreams;

import student_loops_names.Student;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOMain {

    public static void main(String[] args) {
        Student st = new Student();

            try (ObjectOutputStream ous = new ObjectOutputStream(System.out)) {

                ous.writeObject(st);

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println();

        try (ObjectInputStream ius = new ObjectInputStream(System.in)) {


            System.out.println(ius.readObject());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


//        try (ObjectOutputStream ous = new ObjectOutputStream(System.out)) { //new FileOutputStream("src/main/resources/text.txt")
//            Student[] students = Stream.generate(Student::new).limit(10).toArray(Student[]::new);
//            ous.writeObject(students);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (ObjectInputStream ous = new ObjectInputStream(new FileInputStream("src/main/resources/text.txt"))) {
//            System.out.println(ous.readObject());
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//

//        try {
//            Scanner sc = new Scanner(new FileInputStream("src/main/resources/input.csv"));
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//            System.out.println("Next way");
//            String content = Files.readString(Path.of("src/main/resources/input.csv"));
//            System.out.println(content);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
