import java.util.HashMap;
import java.util.Map;

public class DataPool {
    private static DataPool instance;
    private final Map<Integer, User> users;
    private final Map<Integer, WorkoutRoutine> routines;
    private final Map<Integer, FitnessApp> fitnessApps;

    private DataPool() {
        users = new HashMap<>();
        routines = new HashMap<>();
        fitnessApps = new HashMap<>();
    }

    public static DataPool getInstance() {
        if (instance == null) {
            instance = new DataPool();
        }
        return instance;
    }

    // User Management
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public void removeUser(int id) {
        users.remove(id);
    }

    // Workout Routine Management
    public void addRoutine(WorkoutRoutine routine) {
        routines.put(routine.getId(), routine);
    }

    public WorkoutRoutine getRoutine(int id) {
        return routines.get(id);
    }

    public void removeRoutine(int id) {
        routines.remove(id);
    }

    // Fitness App Management
    public void addFitnessApp(FitnessApp app) {
        fitnessApps.put(app.getId(), app);
    }

    public FitnessApp getFitnessApp(int id) {
        return fitnessApps.get(id);
    }

    public void removeFitnessApp(int id) {
        fitnessApps.remove(id);
    }
}
