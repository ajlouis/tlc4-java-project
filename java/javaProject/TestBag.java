package javaProject;

import java.util.ArrayList;
import java.util.List;

public class TestBag {
    public static void main(String[] args) {
        Bag<Student> studentBag = new Bag<>();
        Bag<Lecture> lectureBag = new Bag<>();

        Lecture lecture1 = new Lecture();
        Lecture lecture2 = new Lecture();

        List<Double> grades = new ArrayList<Double>();
        grades.add(34.0);
        grades.add(45.0);
        grades.add(37.0);

        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(54.0);
        grades1.add(95.0);
        grades1.add(67.0);


        Student student1 = new Student(grades, "student1", Level.level1);
        Student student2 = new Student(grades1, "student2", Level.level2);

        NaughtyStudent student3 = new NaughtyStudent(grades, "student3", Level.level1);

        lecture1.enter(student1);
        lecture1.enter(student2);
        lecture1.enter(student3);

        lecture2.enter(student1);
        lecture2.enter(student2);
        lecture2.enter(student3);

        studentBag.add(student1);
        studentBag.add(student2);
        System.out.println("student Bag:: " + studentBag);

        lectureBag.add(lecture1);
        lectureBag.add(lecture2);
        System.out.println("Lecture Bag:: " + lectureBag);

    }
}
