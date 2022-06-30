package lesson_7;

enum DayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    @Override
    public String toString() {
        return name() + " " + ordinal();
    }

    DayOfWeek next() {
        return values()[(ordinal() + 1) % values().length];
    }

    DayOfWeek next2() {
        return values()[(ordinal() + 2) % values().length];
    }

    DayOfWeek previous2() {
        return values()[(ordinal() - 2 + values().length) % values().length];
    }

    boolean isWeekend() {
        switch (this) {
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }

}

public class EnumTest {
    public static void main(String[] args) {
        DayOfWeek d = DayOfWeek.MONDAY;
        for (int i = 0; i < 7; i++) {
            d = d.next();
            System.out.println(d + " " + d.next2() + " " + d.previous2() + " " + d.isWeekend());
        }
    }
}
