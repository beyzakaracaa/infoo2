// StudentManager class analysed and improved with SonarLint
package ex03_sonarlint;

import ex02_mockito.Course;
import ex02_mockito.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentManager {
    private final List<ex02_mockito.Course> courses;

    public StudentManager(List<ex02_mockito.Course> courses) {
        this.courses = courses;
    }

    /**
     * Generates an overview of a course's student distribution by exercise group.
     *
     * @param courseId The ID of the course to analyze.
     * @return A map where keys are group names and values are lists of student details.
     */
    public Map<String, List<String>> generateStudentDistribution(String courseId) {
        ex02_mockito.Course course = findCourseById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course with ID " + courseId + " not found.");
        }

        Map<String, List<ex02_mockito.Student>> groupToStudents = course.getExerciseGroups().stream()
                .collect(Collectors.toMap(
                        group -> group.getName(),
                        group -> group.getStudents()
                ));

        Map<String, List<String>> result = new HashMap<>();
        for (Map.Entry<String, List<Student>> entry : groupToStudents.entrySet()) {
            String groupName = entry.getKey();
            List<String> studentDetails = entry.getValue().stream()
                    .map(student -> String.format("%s (%s)", student.getName(), student.getMatriculationNumber()))
                    .collect(Collectors.toList());
            result.put(groupName, studentDetails);
        }

        return result;
    }

    private Course findCourseById(String courseId) {
        return courses.stream()
                .filter(course -> course.getId().equals(courseId))
                .findFirst()
                .orElse(null);
    }
}