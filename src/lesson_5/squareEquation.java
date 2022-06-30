//Спроектировать класс для решения квадратного уравнения.

package lesson_5;

public class squareEquation {
    private double a, b, c;
    private double x1, x2;

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean solve() {
        if (a == 0) {
            return false;
        }
        double d = b * b - 4 * a * c;
        if (d < 0) {
            return false;
        }
        x1 = (-b - Math.sqrt(d)) / (2 * a);
        x2 = (-b + Math.sqrt(d)) / (2 * a);
        return true;
    }

    public static void main(String[] args) {
        squareEquation equation = new squareEquation();
        equation.setA(1);
        equation.setB(0);
        equation.setC(-4);
        if (equation.solve()) {
            System.out.println("x1 = " + equation.getX1() + ", x2 = " + equation.getX2() + ";");
        } else {
            System.out.println("Корней нет");
        }
    }
}
