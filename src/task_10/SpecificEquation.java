package task_10;

public class SpecificEquation extends AbstractEquation{

    @Override
    public double f(double x) {
        return Math.sin(x);
    }

    public static void main(String[] args) {
        SpecificEquation se = new SpecificEquation();
        System.out.printf("%.2f", se.solve( 3.14, 6.28, 0.01));
    }
}
