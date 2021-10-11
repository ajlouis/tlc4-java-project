package javaProject;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestRegister {

    @Test
    public void testRegister() throws StudentNotFoundException {
        //   Abstract type nameable implementation
//        List<Nameable> studentNames = new ArrayList<Nameable>();

        List<Student> studentNames = new ArrayList<Student>();
        List<NaughtyStudent> naughtyStudents = new ArrayList<>();

        List<Double> grades = new ArrayList<Double>();
        grades.add(54.0);
        grades.add(95.0);
        grades.add(67.0);
        Student student1 = new Student(grades, "student1", Level.level1);

        List<Double> grades1 = new ArrayList<Double>();
        grades.add(64.0);
        grades.add(85.0);
        grades.add(87.0);
        Student student2 = new Student(grades1, "student2", Level.level2);

        studentNames.add(student1);
        studentNames.add(student2);

        Register register = new Register(studentNames);

        List<String> expectedValues = new ArrayList<>();
        expectedValues.add("student1");
        expectedValues.add("student2");
        assertEquals(expectedValues, register.getRegister());
        System.out.println(register.getRegisterByLevel(Level.level2));
        System.out.println(register.printReport());
        System.out.println("comparator::" + register.sort(new StudentComparator()));
        System.out.println("Exception test::" + register.getStudentByName("stud"));

    }
}
