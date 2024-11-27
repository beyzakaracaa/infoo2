package hw03.ex01;

public abstract class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseDetails() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }
}
