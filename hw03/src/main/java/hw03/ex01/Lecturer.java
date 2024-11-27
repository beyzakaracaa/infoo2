package hw03.ex01;

import java.util.HashSet;
import java.util.Set;

public class Lecturer extends User {
    private Set<Course> managedCourses = new HashSet<>();

    public Lecturer(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }


    public void login() {
        // Lecturer login logic here
    }

    public void manageCourse(Course course) {
        managedCourses.add(course);
    }
}

