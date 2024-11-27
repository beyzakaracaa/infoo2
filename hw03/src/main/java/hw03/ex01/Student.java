package hw03.ex01;

import java.util.HashSet;
import java.util.Set;

public class Student extends User {
    private Set<Course> registeredCourses = new HashSet<>();

    public Student(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }


    public void login() {
        // Student login logic here
    }

    public void registerToCourse(Course course) {
        registeredCourses.add(course);
    }
}
