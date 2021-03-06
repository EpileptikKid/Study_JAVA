package task_7;

public class Citizen extends Human {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Citizen(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    public String toString() {
        return super.toString() + ", гражданство - " + country;
    }
}
