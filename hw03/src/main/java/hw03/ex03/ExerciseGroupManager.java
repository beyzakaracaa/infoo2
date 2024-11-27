package hw03.ex03;

public class ExerciseGroupManager {
    /**
     * This method is used to regularly check whether the maximum cap-
     * acity of students for the available groups has been exceeded.
     *
     * @param totalStudents The total number of students to assign.
     * @param groupSize The maximum number of students in each group.
     * @param availableGroups The total number of groups available
     *                        for assignment.
     * @return  The number of students that must be assigned with the
     *          current number of registered students and available
     *          groups. Returns 0 in case totalStudent <=0.
     * @throws  IllegalArgumentException if group size or number of
     *          groups is zero or negative.
     */

    public int checkGroupCapacities(int totalStudents, int groupSize, int availableGroups) {
        // Checks
        if(totalStudents <= 0) return 0;
        if (groupSize <= 0) throw
                new IllegalArgumentException("groupSize must be greater than zero");
        if (availableGroups <= 0) throw
                new IllegalArgumentException("availableGroups must be greater than zero");

        int spots = groupSize * availableGroups;
        if(spots < totalStudents) return totalStudents-spots;
        return 0; // if spots >= totalStudents
    }
}
