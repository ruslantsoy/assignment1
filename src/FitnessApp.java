import java.util.Objects;

public class FitnessApp {

    public int id;
    public String name;
    public FitnessApp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FitnessApp that = (FitnessApp) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "FitnessApp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
