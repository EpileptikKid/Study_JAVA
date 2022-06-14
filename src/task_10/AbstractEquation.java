package task_10;

public abstract class AbstractEquation {
    abstract public double f(double x);



    public double solve(double a, double b, double eps) {
        double min = a;
        for (double x = a + eps; x <= b; x += eps) {
            if (f(x) < f(min)) {
                min = x;
            }
        }
        return min;
    }
}
