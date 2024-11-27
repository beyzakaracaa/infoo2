package hw03.ex01;

public class Lecture extends Course{
    private String lectureId;
    private String lectureName;

    public Lecture(String courseId, String courseName, String lectureId, String lectureName) {
        super(courseId, courseName);
        this.lectureId = lectureId;
        this.lectureName = lectureName;
    }

    public String getLectureDetails() {
        return "Lecture ID: " + lectureId + ", Lecture Name: " + lectureName;
    }
}
