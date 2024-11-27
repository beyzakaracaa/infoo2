package homework04.src.main.java.hw04.ex02a;

import java.util.ArrayList;

/**
 * Class Invariant:
 * context CourseManager inv: courses->isUnique(c) and courses->forAll(c | c <> null)
 */
public class CourseManager {
    private ArrayList<String> courses;

    public CourseManager() {
        this.courses = new ArrayList <>();
    }

    // Added overriding toString for testing
    @Override
    public String toString() {
        return "CourseManager{" +
                "courses=" + courses +
                '}';
    }

    /**
     * Adds a course to the list. It should only do so
     * if courseName is not null and the course is not
     * already in the list.
     * Pre-conditions:
     * context CourseManager::addCourse(courseName) pre: courseName <> null and not courses->includes(courseName)
     * Post-conditions:
     * context CourseManager::addCourse(courseName) post: courses->includes(courseName) and courses->size = courses@pre->size + 1
     *
     * @param courseName The name of the course to add.
     */
    public final void addCourse(String courseName) {
        courses.add(courseName);
    }

    /**
     * Removes a course from the list. It should only do so
     * if courseName is not null and the course is in the list.
     *
     * @param courseName The name of the course to remove.
     */
    public final boolean removeCourse(String courseName) {
        return courses.remove(courseName);
    }
}