package javaProject;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestStudent {


    @Test
    public void testAverageGrade() {
        List<Double> grades = new ArrayList<Double>();
        grades.add(54.0);
        grades.add(95.0);
        grades.add(67.0);
        Student student1 = new Student(grades,"student1",Level.level1);
        assertEquals(72.0, student1.getAverageGrade());
    }
}
