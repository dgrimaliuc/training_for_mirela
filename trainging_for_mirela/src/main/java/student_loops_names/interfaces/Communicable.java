package student_loops_names.interfaces;

import student_loops_names.Student;

public interface Communicable {

    String communicate(String words);
    String communicate(String words, Student student2);
}

