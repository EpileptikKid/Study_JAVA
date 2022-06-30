package task_7;

public class HourlyEployee extends Employer{
    private int ratePerHour, hours;

    public HourlyEployee(String name, int age, String country, String work, int ratePerHour, int hours) {
        super(name, age, country, work);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int SalaryPerMonth() {
        return hours * ratePerHour;
    }

    public String toString() {
        return super.toString() + ", зарплата - " + this.SalaryPerMonth();
    }
}
