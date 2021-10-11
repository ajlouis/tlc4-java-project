package javaProject;

import java.util.List;

public class NaughtyStudent extends Student {
    public NaughtyStudent(List<Double> g, String name, Level level) {
        super(g, name, level);
    }

    @Override
    public Double getAverageGrade() {
        double naughtyStudentAverage = super.getAverageGrade();
        return naughtyStudentAverage * 1.1;
    }
}
