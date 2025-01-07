import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataPool pool = DataPool.getInstance();

        // Add Users
        Athlete user1 = new Athlete(1, "Ruslan", 18, 70, 182, "male", "Running", 8);
        Athlete user2 = new Athlete(2, "Nikita", 20, 50, 190, "male", "Swimming", 10);
        pool.addUser(user1);
        pool.addUser(user2);

        List <User> usersList = new ArrayList<User>();
        usersList.add(user1);
        usersList.add(user2);

        List <User> maleUsersList = new ArrayList<User>();
        List <User> femaleUsersList = new ArrayList<User>();



        for (User user : usersList) {
            if (Objects.equals(user.getGender(), "male")) {
                maleUsersList.add(user);
            }
            else if (Objects.equals(user.getGender(), "female")) {
                femaleUsersList.add(user);
            }

        }

        // Add Workout Routines
        PullUps pullUps = new PullUps(1, "Pull-Ups", "10:30", 2, 10, 3);
        Running running = new Running(2, "Running", "12:30", 0, 30, 5);
        pool.addRoutine(pullUps);
        pool.addRoutine(running);



        List <WorkoutRoutine> workoutRoutinesList = new ArrayList<WorkoutRoutine>();

        workoutRoutinesList.add(pullUps);
        workoutRoutinesList.add(running);

        workoutRoutinesList.sort(Comparator.comparing(WorkoutRoutine::getId));

        for(WorkoutRoutine workoutRoutine : workoutRoutinesList) {
            System.out.println(workoutRoutine);
        }
        // Add Fitness Apps
        FitnessApp app1 = new FitnessApp(1, "FitTrack");
        FitnessApp app2 = new FitnessApp(2, "HealthMonitor");
        pool.addFitnessApp(app1);
        pool.addFitnessApp(app2);

        // Access data
//        System.out.println(pool.getUser(1)); // Ruslan
//        System.out.println(pool.getRoutine(2)); // Running
//        System.out.println(pool.getFitnessApp(1)); // FitTrack



    }
}