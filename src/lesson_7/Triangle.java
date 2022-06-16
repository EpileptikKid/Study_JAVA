package lesson_7;

import java.util.Comparator;

public class Triangle  {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public double area() {
        return Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)) / 4;
    }




    @Override
    public String toString() {
        return "сторона а - " + a + ", сторона b - " + b + ", сторона с - " + c + ", площадь - " + area();
    }
}

class CompareByArea implements Comparator<Triangle> {
    @Override
    public int compare(Triangle o1, Triangle o2) {
        return Double.compare(o1.area(), o2.area());
    }
}

class TestTriangle {
    public static void main(String[] args) {
        Triangle[] arr = {
                new Triangle(2.0, 2.0, 2.0),
                new Triangle(3.0, 2.0, 4.0),
                new Triangle(1.0, 2.0, 2.0)
        };

        java.util.Arrays.sort(arr, new CompareByArea());

        for (Triangle t : arr) {
            System.out.println(t);
        }

    }
}
