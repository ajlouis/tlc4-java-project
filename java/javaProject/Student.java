package javaProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student implements Nameable, HasLevel {

    private List<Double> grades;
    private double average;
    private String name;
    private Level studentLevel;
    public static List<Student> allStudents = new ArrayList<>();

    public Student(List<Double> g, String studentName, Level level) {
        grades = g;
        name = studentName;
        studentLevel = level;
        allStudents.add(this);
    }

    public Double getAverageGrade() {
        double sum = grades.stream().collect(Collectors.summingDouble(Double::doubleValue));
        average = (sum / grades.size());
        return average;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        return average;
    }

//    public getGradeDoubleStream() {
//
//    }


    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", average=" + average +
                ", name='" + name + '\'' +
                ", studentLevel=" + studentLevel +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return studentLevel;
    }

//    public static int totalcount =0;
//    add to static int in Student class;

}