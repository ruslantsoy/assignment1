public class User {
    private int id;
    private String username;
    private int age;
    public double weight;
    public double height;
    public String gender;


    public User(int id, String username, int age, double weight, double height, String gender) {
        setId(id);
        setAge(age);
        setUsername(username);
        setWeight(weight);
        setHeight(height);
        setGender(gender);
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

}
