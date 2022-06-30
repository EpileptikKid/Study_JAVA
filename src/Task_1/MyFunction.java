package Task_1;



public class MyFunction {

    public static double f(double x) {
        return x * x - 2;
    }

    public static void main(String[] args) {
        System.out.printf("%3f", MinFunc.minFunc(-2, 2, 0.00001, x -> (x + 1) * (x + 1)));
        System.out.println();
        System.out.printf("%3f", MinFunc.minFunc(-2, 2, 0.00001, MyFunction::f));
        System.out.println();
        System.out.printf("%3f", MinFunc.minFunc(-2, 2, 0.00001, Math::sin));
    }
}
