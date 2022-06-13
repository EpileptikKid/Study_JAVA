//Модифицировать пример программы для представления точки в трехмерном пространстве

package task_5;

public class Point {
    private double x, y, z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) +
                         (p1.y - p2.y) * (p1.y - p2.y) +
                         (p1.z - p2.z) * (p1.z - p2.z));
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4, 5);
        System.out.println(p1.distance());
        Point p2 = new Point(4, 5, 6);
        System.out.println(distance(p1, p2));
    }
}
