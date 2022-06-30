package lesson_6;

public class MinFunc implements FunctionWithDerivates {
    @Override
    public double f(double x) {
        return 2 * x * x * x - 15 * x * x + 36 * x - 14;
    }

    public static void main(String[] args) {
        double[] q = Newton.solve(1, 5, 0.1, new MinFunc());

    }
}


