package ex02_mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentManagerTest {

    private StudentManager studentManager;

    @Mock
    private Student student1;

    @Mock
    private Student student2;

    @Mock
    private ExerciseGroup group1;

    @Mock
    private ExerciseGroup group2;

    @Mock
    private Course course;

    @Mock
    private List<Course> courses;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        courses = new ArrayList<>();
        studentManager = new StudentManager(null, courses);
    }

    @Test
    public void testGenerateStudentDistribution_Success() {
        // Arrange
        when(student1.getName()).thenReturn("Alice");
        when(student1.getMatriculationNumber()).thenReturn("A123");
        when(student2.getName()).thenReturn("Bob");
        when(student2.getMatriculationNumber()).thenReturn("B456");
        when(group1.getName()).thenReturn("Group 1");
        when(group1.getStudents()).thenReturn(List.of(student1));
        when(group2.getName()).thenReturn("Group 2");
        when(group2.getStudents()).thenReturn(List.of(student2));
        when(course.getId()).thenReturn("Software Engineering");
        when(course.getExerciseGroups()).thenReturn(List.of(group1, group2));

        // Act
        courses.add(course);
        Map<String, List<String>> distribution = studentManager.generateStudentDistribution("Software Engineering");

        // Assert
        assertEquals(2, distribution.size());
        assertTrue(distribution.containsKey("Group 1"));
        assertTrue(distribution.containsKey("Group 2"));
        assertEquals(List.of("Alice (A123)"), distribution.get("Group 1"));
        assertEquals(List.of("Bob (B456)"), distribution.get("Group 2"));
    }

    @Test
    public void testGenerateStudentDistribution_CourseNotFound() {
        // Arrange
        when(course.getId()).thenReturn("Object-Oriented Software Engineering");
        // Act
        courses.add(course);
        // Assert
        assertThrows(IllegalArgumentException.class, () -> studentManager.generateStudentDistribution("Software Engineering"));
    }
}
