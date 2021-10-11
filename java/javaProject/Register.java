package javaProject;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
//   Abstract type nameable implementation
//    private List<Nameable> studentNames = new ArrayList<Nameable>();

    //    Refactor
    private List<Student> studentNames = new ArrayList<Student>();
    private List<String> s = new ArrayList<String>();
    private List<Student> students = new ArrayList<>();


//     Abstract type nameable implementation
//    public Register(List<Nameable> names) {
//        studentNames = names;
//    }

    public Register(List<Student> s) {
        studentNames = s;
    }

    public List<String> getRegister() {
        for (Nameable students : studentNames) {
            s.add(students.getName());
        }
        return s;
    }


//    First implementation with Enums
//    public List<String> getRegisterByLevel(Level l) {
//        return Student.allStudents
//                .stream().
//                filter(s -> s.getLevel() == l)
//                .map(n -> n.getName())
//                .collect(Collectors.toList());
//    }


    public Map<Level, List<Student>> getRegisterByLevel(Level l) {
        students = Student.allStudents
                .stream().
                filter(s -> s.getLevel() == l)
                .collect(Collectors.toCollection(ArrayList::new));
        Map<Level, List<Student>> d = new HashMap<>();
        d.put(l, students);
        return d;
    }


    public Student getStudentByName(String name) throws StudentNotFoundException {
         for (Student student : Student.allStudents) {
            if (student.getName() == name) {
                return student;
            }
        }
        throw new StudentNotFoundException(name + " not found");
    }

//    public Student studentByName(String name) throws StudentNotFoundException {
//        Student std = students.stream()
//                .map(student -> (student.getName() == name ? student : null))
//                .collect(Collectors.toList())
//                .get(0);
//        if (std != null) {
//            return std;
//        }
//        throw new StudentNotFoundException(name + " not found");
//    }

    public Map<Level, List<Student>> printReport() {
        Map<Level, List<Student>> mappingLevels = Student.allStudents.stream().collect(Collectors.groupingBy(Student::getLevel));
        return mappingLevels;
    }


    public List<Student> sort(Comparator<Student> c) {
        Collections.sort(Student.allStudents, c);
        return Student.allStudents;
    }

    @Override
    public String toString() {
        return "Register{" +
                "s=" + s +
                '}';
    }
}
