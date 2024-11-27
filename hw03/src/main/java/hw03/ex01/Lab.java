package hw03.ex01;

public class Lab extends Course{
    private String labId;
    private String labName;

    public Lab(String courseId, String courseName, String labId, String labName) {
        super(courseId, courseName);
        this.labId = labId;
        this.labName = labName;
    }

}
