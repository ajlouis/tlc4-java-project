package javaProject;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestNaughtyStudent  {
    @Test
    public void testAverageGrade() {
        List<Double> grades = new ArrayList<Double>();
        grades.add(54.0);
        grades.add(95.0);
        grades.add(67.0);
        NaughtyStudent student1 = new NaughtyStudent(grades,"student1",Level.level1);
        assertEquals(79.2, student1.getAverageGrade());
    }

}
