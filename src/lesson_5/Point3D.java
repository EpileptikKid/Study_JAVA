package lesson_5;

public class Point3D {
    private double x, y, z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static double distance(Point3D p1, Point3D p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) +
                (p1.y - p2.y) * (p1.y - p2.y) +
                (p1.z - p2.z) * (p1.z - p2.z));
    }

    public static void main(String[] args) {
        Point3D p1 = new Point3D(3, 4, 5);
        System.out.println(p1.distance());
        Point3D p2 = new Point3D(4, 5, 6);
        System.out.println(distance(p1, p2));
    }
}
