package javaProject;

public class BagofStudents {

    public BagofStudents() {
    }

    public void addStudent(Student s) {
        Student.allStudents.add(s);
    }

    public void removeStudent(Student s) {
        Student.allStudents.remove(s);
    }

    public void clearStudents() {
        Student.allStudents.clear();
    }
}
