import java.util.Objects;

public abstract class WorkoutRoutine {
    private int id;
    private String name;
    private String time;
    private int rest_time;

    public WorkoutRoutine(int id, String name, String time, int rest_time) {
        this.id = id;
        setId(id);
        setName(name);
        setTime(time);
        setRestTime(rest_time);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRestTime(int restTime) {
        this.rest_time = restTime;
    }

    public int getRestTime() {
        return rest_time;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        WorkoutRoutine that = (WorkoutRoutine) o;
        return id == that.id && rest_time == that.rest_time && Objects.equals(name, that.name) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, rest_time);
    }

    @Override
    public String toString() {
        return "WorkoutRoutine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", rest_time=" + rest_time +
                '}';
    }
}

class PullUps extends WorkoutRoutine {
    private int repeats;
    private int sets;

    public PullUps(int id, String name,  String time, int rest_time, int repeats, int sets) {
        super(id, name, time, rest_time);
        setRepeats(repeats);
        setSets(sets);
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PullUps pullUps = (PullUps) o;
        return repeats == pullUps.repeats && sets == pullUps.sets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), repeats, sets);
    }

    @Override
    public String toString() {
        return  "PullUps{" +
                "repeats=" + repeats +
                ", sets=" + sets +
                '}';
    }
}

class PushUps extends WorkoutRoutine {
    private int repeats;
    private int sets;

    public PushUps(int id, String name, String time, int rest_time, int repeats, int sets) {
        super(id, name, time, rest_time);
        setRepeats(repeats);
        setSets(sets);
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PushUps pushUps = (PushUps) o;
        return repeats == pushUps.repeats && sets == pushUps.sets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), repeats, sets);
    }

    @Override
    public String toString() {
        return "PushUps{" +
                "repeats=" + repeats +
                ", sets=" + sets +
                '}';
    }
}

class Plank extends WorkoutRoutine {
    private int duration;

    public Plank(int id, String name, String time, int rest_time, int duration) {
        super(id, name, time, rest_time);
        setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plank plank = (Plank) o;
        return duration == plank.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration);
    }

    @Override
    public String toString() {
        return "Plank{" +
                "duration=" + duration +
                '}';
    }
}

class BenchPress extends WorkoutRoutine {
    private int repeats;
    private int sets;
    private int extraWeight;

    public BenchPress(int id, String name, String time, int rest_time, int repeats, int sets, int extraWeight) {
        super(id, name, time, rest_time);
        setRepeats(repeats);
        setSets(sets);
        setExtraWeight(extraWeight);
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getExtraWeight() {
        return extraWeight;
    }

    public void setExtraWeight(int extraWeight) {
        this.extraWeight = extraWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BenchPress that = (BenchPress) o;
        return repeats == that.repeats && sets == that.sets && extraWeight == that.extraWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), repeats, sets, extraWeight);
    }

    @Override
    public String toString() {
        return "BenchPress{" +
                "repeats=" + repeats +
                ", sets=" + sets +
                ", extraWeight=" + extraWeight +
                '}';
    }
}

class Running extends WorkoutRoutine {
    private int duration;
    private int distance;

    public Running(int id, String name, String time, int rest_time, int duration, int distance) {
        super(id, name, time, rest_time);
        setDuration(duration);
        setDistance(distance);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Running running = (Running) o;
        return duration == running.duration && distance == running.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration, distance);
    }

    @Override
    public String toString() {
        return "Running{" +
                "duration=" + duration +
                '}';
    }
}