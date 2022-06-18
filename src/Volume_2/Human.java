package Volume_2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Human {
    private final String name;
    private final Calendar date;

    public Human(String name, Calendar date) {
        this.date = date;
        this.name = name;
    }

    private int age() {
        Date date = new Date(System.currentTimeMillis());
        Calendar now = GregorianCalendar.getInstance();
        now.setTime(date);
        int age =  this.date.get(Calendar.YEAR) - now.get(Calendar.YEAR) + 1;
        if (this.date.get(Calendar.MONTH) < now.get(Calendar.MONTH)) {
            age--;
        }
        return age;
    }

    public String toString() {
        return "Name - " + name + ", age - " + Math.abs(this.age());
    }

    public static void main(String[] args) {
        Human a = new Human("Dmitriy", new GregorianCalendar(2002, Calendar.JUNE, 13));
        Human b = new Human("Vasiliy", new GregorianCalendar(1998, Calendar.OCTOBER, 13));
        System.out.println(a);
        System.out.println(b);
    }

}
