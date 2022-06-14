package Task_1;

public class MinFunc {
    public static double minFunc(double from, double to, double eps, Function func) {
        double min = from;
        for (double i = from; i <= to; i += eps) {
            if (func.f(i) < func.f(min)) {
                min = i;
            }
        }
        return min;
    }
}
