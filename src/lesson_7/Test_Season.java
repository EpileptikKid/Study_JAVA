package lesson_7;

enum Season {
    SUMMER,
    AUTUMN,
    WINTER,
    SPRING;

    @Override
    public String toString() {
        return name() + " " + ordinal();
    }

    Season next() {
        return values()[(ordinal() + 1) % values().length];
    }

    Season previous() {
        return values()[(ordinal() - 1 + values().length) % values().length];
    }

}

public class Test_Season {
    public static void main(String[] args) {
        Season s = Season.SPRING;
        for (int i = 0; i < 4; i++) {
            s = s.next();
            System.out.println(s + " " + s.previous() + " " + s.next());
        }
    }
}
