public class WorkoutRoutine {
    private int id;
    private String WorkoutRoutineName;
    private int WorkoutRoutineDuration;
    private String WorkoutRoutineTime;
    private int WorkoutRoutineRepeats;

    public WorkoutRoutine(int id, String workoutRoutineName, int workoutRoutineDuration, String workoutRoutineTime, int workoutRoutineRepeats) {
        this.id = id;
        setId(id);
        setWorkoutRoutineDuration(workoutRoutineDuration);
        setWorkoutRoutineName(workoutRoutineName);
        setWorkoutRoutineRepeats(workoutRoutineRepeats);
        setWorkoutRoutineTime(workoutRoutineTime);
    }

    public String getWorkoutRoutineName() {
        return WorkoutRoutineName;
    }

    public void setWorkoutRoutineName(String workoutRoutineName) {
        this.WorkoutRoutineName = workoutRoutineName;
    }

    public String getWorkoutRoutineTime() {
        return WorkoutRoutineTime;
    }

    public void setWorkoutRoutineTime(String workoutRoutineTime) {
        this.WorkoutRoutineTime = workoutRoutineTime;
    }

    public int getWorkoutRoutineRepeats() {
        return WorkoutRoutineRepeats;
    }

    public void setWorkoutRoutineRepeats(int workoutRoutineRepeats) {
        this.WorkoutRoutineRepeats = workoutRoutineRepeats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkoutRoutineDuration() {
        return WorkoutRoutineDuration;
    }

    public void setWorkoutRoutineDuration(int workoutRoutineDuration) {
        this.WorkoutRoutineDuration = workoutRoutineDuration;
    }

}
