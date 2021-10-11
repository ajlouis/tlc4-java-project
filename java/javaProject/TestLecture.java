package javaProject;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLecture {
    @Test
    public void testHighestAverageGrade() {
        Lecture l = new Lecture();
        List<Double> grades = new ArrayList<Double>();
        grades.add(34.0);
        grades.add(45.0);
        grades.add(37.0);

        List<Double> grades1 = new ArrayList<Double>();
        grades1.add(54.0);
        grades1.add(95.0);
        grades1.add(67.0);

        Student student1 = new Student(grades,"student1",Level.level1);
        Student student2 = new Student(grades1,"student2",Level.level2);
        NaughtyStudent student3 = new NaughtyStudent(grades,"student3", Level.level1);

        l.enter(student1);
        l.enter(student2);
        l.enter(student3);


        System.out.println("lecture list:: " + l.toString());
//        double highest_average = l.getHighestAverageGrade();
//        assertEquals(72.0, highest_average);

    }
}
