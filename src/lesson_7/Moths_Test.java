package lesson_7;

enum Months {
    JANUARY(31, "Січень"),
    FEBRUARY(28, "Лютий"),
    MARCH(31, "Березень"),
    APRIL(30, "Квітень"),
    MAY(31, "Травень"),
    JUNE(30, "Червень"),
    JULY(31, "Липень"),
    AUGUST(31, "Серпень"),
    SEPTEMBER(30, "Вересень"),
    OCTOBER(31, "Жовтень"),
    NOVEMBER(30, "Листопад"),
    DECEMBER(31, "Грудень");

    private final int amountOfDays;
    private final String nameU;

    Months(int amount, String name) {
        amountOfDays = amount;
        nameU = name;
    }

    String getSeson() {
        switch (this) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return "WINTER";
            case MARCH:
            case APRIL:
            case MAY:
                return "SPRING";
            case JUNE:
            case JULY:
            case AUGUST:
                return "SUMMER";
            default:
                return "AUTUMN";
        }
    }

    Months getNext() {
        return values()[(ordinal() + 1) % values().length];
    }

    @Override
    public String toString() {
        return this.nameU + ", " + amountOfDays + " days, season - " + this.getSeson();
    }
}

public class Moths_Test {
    public static void main(String[] args) {
        Months a = Months.APRIL;
        for (int i = 0; i < 12; i++) {
            a = a.getNext();
            System.out.println(a);
        }
    }
}
