package ex01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseGroupManagerTest {

    private ExerciseGroupManager manager = new ExerciseGroupManager();

    @ParameterizedTest(name = "Test {index}: totalStudents={0}, groupSize={1}, availableGroups={2} → Expected={3}")
    @CsvSource({
            "-5, 10, 3, 0",
            "0, 10, 3, 0",
            "15, -3, 3, exception",
            "15, 0, 3, exception",
            "15, 5, 0, exception",
            "20, 5, 4, 0",
            "22, 5, 4, 2",
            "2147483647, 5, 1, 2147483642"
    })
    void testCheckGroupCapacities(int totalStudents, int groupSize, int availableGroups, String expected) {
        if ("exception".equals(expected)) {
            assertThrows(IllegalArgumentException.class, () -> {
                manager.checkGroupCapacities(totalStudents, groupSize, availableGroups);
            });
        } else {
            int expectedOutput = Integer.parseInt(expected);
            assertEquals(expectedOutput, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));
        }
    }

}
