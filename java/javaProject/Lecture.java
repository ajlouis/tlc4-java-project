package javaProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lecture {

    private List<Student> attendingStudents = new ArrayList<Student>();
    List<Double> studentAverages = new ArrayList<Double>();
    public static List<Lecture> allLectures = new ArrayList<>();


    public Lecture() {
        allLectures.add(this);
    }

    public double getHighestAverageGrade() {
        for (Student student : attendingStudents
        ) {
            studentAverages.add(student.getAverageGrade());
        }
        System.out.println("Highest average" + Collections.max(studentAverages));
        return Collections.max(studentAverages);
    }

    public List<Student> getAttendingStudents() {
        return attendingStudents;
    }

    public void enter(Student s) {
        attendingStudents.add(s);
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "attendingStudents=" + attendingStudents +
                '}';
    }
}
