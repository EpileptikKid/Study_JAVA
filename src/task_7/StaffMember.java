package task_7;

public class StaffMember extends Employer{
    private int rate, percentPrem;

    public StaffMember(String name, int age, String country, String work, int rate, int percentPrem) {
        super(name, age, country, work);
        this.rate = rate;
        this.percentPrem = percentPrem;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPercentPrem() {
        return percentPrem;
    }

    public void setPercentPrem(int percentPrem) {
        this.percentPrem = percentPrem;
    }

    @Override
    public int SalaryPerMonth() {
        return rate * (1 + percentPrem / 100);
    }

    public String toString() {
        return super.toString() + ", зарплата в месяц - " + this.SalaryPerMonth();
    }


}
