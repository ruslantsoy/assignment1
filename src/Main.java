
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Ruslan", 18, 69, 182, "male");
        WorkoutRoutine pullUps = new WorkoutRoutine(1, "pull ups", 20, "20:20", 20);
        FitnessApp fitnessApp1 = new FitnessApp(1, "GOGYM");
        System.out.println("Username: " + user1.getUsername() + " Age: " + user1.getAge() + " Weight: " + user1.weight + " Height: " + user1.height + " Gender: " + user1.gender);
        System.out.println("Workout Routine Name: " + pullUps.getWorkoutRoutineName() + " Workout Routine Duration: " + pullUps.getWorkoutRoutineDuration() + " Workout Routine Time: " + pullUps.getWorkoutRoutineTime() + " Workout Routine Repeats: " + pullUps.getWorkoutRoutineRepeats());
        System.out.println("Fitness app name: " + fitnessApp1.name);
    }
}