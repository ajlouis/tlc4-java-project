package javaProject;

public class BagOfLectures {

    public BagOfLectures() {
    }

    public void addLectures(Lecture l) {
        Lecture.allLectures.add(l);
    }

    public void removeLectures(Student s) {
        Lecture.allLectures.remove(s);
    }

    public void clearLectures() {
        Lecture.allLectures.clear();
    }
}
