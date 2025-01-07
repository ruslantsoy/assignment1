import java.util.Objects;

public class User {
    private int id;
    private String username;
    private int age;
    public double weight;
    public double height;
    public String gender;
    public String mobile_number;


    public User(int id, String username, int age, double weight, double height, String gender) {
        setId(id);
        setAge(age);
        setUsername(username);
        setWeight(weight);
        setHeight(height);
        setGender(gender);
        setMobile_number(mobile_number);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile_number() {return mobile_number;}

    public void setMobile_number(String mobile_number) {this.mobile_number = mobile_number;}


    public double calculatePercentOfFat() {
        return (weight/ ((height/100) * (height/100)));
    }



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Double.compare(weight, user.weight) == 0 && Double.compare(height, user.height) == 0 && Objects.equals(username, user.username) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, age, weight, height, gender);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Athlete extends User{
    private String sportType;
    private int weeklyTrainingHours;
    private double maxHeartRate;

    public Athlete(int id, String username, int age, double weight, double height, String gender, String sportType, int weeklyTrainingHours) {
        super(id, username, age, weight, height, gender);
        setSportType(sportType);
        setWeeklyTrainingHours(weeklyTrainingHours);
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getWeeklyTrainingHours() {
        return weeklyTrainingHours;
    }

    public void setWeeklyTrainingHours(int weeklyTrainingHours) {
        this.weeklyTrainingHours = weeklyTrainingHours;
    }

    public double getMaxHeartRate() {
        return maxHeartRate;
    }

    public double calculateMaxHeartRate() {
        return 220 - getAge();
    }

    public double calculateCaloriesBurned(double activityHours) {
        return activityHours * 8 * getWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Athlete athlete = (Athlete) o;
        return weeklyTrainingHours == athlete.weeklyTrainingHours && Double.compare(maxHeartRate, athlete.maxHeartRate) == 0 && Objects.equals(sportType, athlete.sportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sportType, weeklyTrainingHours, maxHeartRate);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "sportType='" + sportType + '\'' +
                ", weeklyTrainingHours=" + weeklyTrainingHours +
                ", maxHeartRate=" + maxHeartRate +
                '}';
    }
}
