package lesson_6;

public class Newton {
    public static double[] solve(double from, double to, double eps, FunctionWithDerivates func) {
        double[] x = new double[10];
        int k = 0;
        for (double i = from; i <= to; i += eps) {
            if (Math.abs(func.f1(i)) < eps) {
                x[k] = i;
                k++;
                System.out.println(i);
            }
        }
        return x;
    }
}
