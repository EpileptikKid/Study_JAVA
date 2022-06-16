package lesson_7;

public class Circle implements Comparable<Circle> {
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(radius, o.radius);
    }

    @Override
    public String toString() {
        return "радиус окружности - " + radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle[] arr = {
                new Circle(12.0),
                new Circle(10.0),
                new Circle(18.0),
                new Circle(1.0),
                new Circle(20.0),
                new Circle(11.0),
                new Circle(8.0) };
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }
}
