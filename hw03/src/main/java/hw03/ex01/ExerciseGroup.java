package hw03.ex01;

import java.util.HashSet;
import java.util.Set;

public class ExerciseGroup {
    private String groupId;
    private int maxCapacity;
    private String timeSlot;
    private Set<Student> students = new HashSet<>();

    public ExerciseGroup(String groupId, int maxCapacity, String timeSlot) {
        this.groupId = groupId;
        this.maxCapacity = maxCapacity;
        this.timeSlot = timeSlot;
    }

    public void registerStudent(Student student) {
        if (students.size() < maxCapacity) {
            students.add(student);
        }
    }
}
