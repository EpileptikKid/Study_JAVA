package task_9;

public abstract class AbstractArrayOfPoints {

    public abstract void setPoint(int i, double x, double y);

    public abstract double getX(int i);

    public abstract double getY(int i);

    public abstract int count();

    public abstract void addPoint(double x, double y);

    public abstract void sortByX();

    public abstract void removeLast();

    public String toString() {
        String s = "";
        for (int i = 0; i < count(); i++) {
            s += "x = " + getX(i) + ", y = " + getY(i) + ";\n";
        }
        return s;
    }

    public void test() {
        addPoint(22, 45);
        addPoint(4, 11);
        addPoint(30, 5.5);
        addPoint(-2, 48);
        sortByX();
        System.out.println(this);
    }
}
