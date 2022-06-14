package task_7;

public abstract class Employer extends Citizen{
    private String work;

    public Employer(String name, int age, String country, String work) {
        super(name, age, country);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String toString() {
        return super.toString() + ", работа - " + work;
    }

    public abstract int SalaryPerMonth();
}
