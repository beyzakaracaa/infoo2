// Homework 3 Exercise 3
package hw03.ex03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseGroupManagerTest {

    private ExerciseGroupManager manager = new ExerciseGroupManager();

    @ParameterizedTest
    @CsvSource({"30, 10, 5", "20, 5, 4"})
    public void testStandardTotalStudentsWithinCapacity(int totalStudents, int groupSize, int capacity) {
        int expectedResult = 0;
        int actualResult = manager.checkGroupCapacities(totalStudents, groupSize, capacity);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testExceedingCapacity() {
        assertEquals(20, manager.checkGroupCapacities(50, 10, 3));
    }

    @ParameterizedTest
    @CsvSource({"0, 10, 5", "-5, 5, 4"})
    public void testNoOrNegativeTotalStudents(int totalStudents, int groupSize, int availableGroups) {
        int expectedResult = 0;
        int actualResult = manager.checkGroupCapacities(totalStudents, groupSize, availableGroups);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"0", "-2"})
    public void testInvalidGroupSize(int groupSize) {
        assertThrows(IllegalArgumentException.class, () -> manager.checkGroupCapacities(10, groupSize, 3));
    }

    @ParameterizedTest
    @CsvSource({"-10", "0"})
    public void testInvalidAvailableGroups(int availableGroups) {
        assertThrows(IllegalArgumentException.class, () -> manager.checkGroupCapacities(10, 5, availableGroups));
    }
}
