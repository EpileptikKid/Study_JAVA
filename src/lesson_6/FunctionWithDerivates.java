package lesson_6;

public interface FunctionWithDerivates {
    double DX = 0.0001;
    double f(double x);

    default double f1(double x) {
        return (f(x + DX) - f(x)) / DX;
    }

    default double f2(double x) {
        return (f1(x + DX) - f1(x)) / DX;
    }
}
