package javaProject;

import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private List<Double> grades;
    private double average;

    public Student(List<Double> g) {
        grades = g;
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

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", average=" + average +
                '}';
    }
}