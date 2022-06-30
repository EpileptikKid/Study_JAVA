//Создать класс для представления комплексного числа. Реализовать конструкторы, функции сложения, вычитания, умножения деления и умножения на константу
//Осуществить тестирование всех разработанных методов.


package lesson_5;

public class ComlexNumber {
    private  double a, b;

    public ComlexNumber() {
        a = 0;
        b = 1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }



    public ComlexNumber(double a, double b) {
        if (b == 0) {
            System.err.println("Знаменатель не положительньій!");
            System.exit(1);
        }
        this.a = a;
        this.b = b;
    }

    public void set(double a, double b) {
        if (b == 0) {
            System.err.println("Знаменатель не положительньій!");
            System.exit(1);
        }
        this.a = a;
        this.b = b;
    }

    public String toString() {
        if (b < 0) {
            return a + " - " + Math.abs(b) + "i;";
        } else {
            return a + " + " + Math.abs(b) + "i;";
        }
    }

    public static ComlexNumber Plus(ComlexNumber a, ComlexNumber b) {
        ComlexNumber c = new ComlexNumber();
        c.set(a.getA() + b.getA(), a.getB() + b.getB());
        return c;
    }

    public static ComlexNumber Multiply(ComlexNumber a, ComlexNumber b) {
        ComlexNumber c = new ComlexNumber();
        c.set(a.getA() * b.getB() - a.getB() * b.getB(), a.getB() * b.getA() + a.getA() * b.getB());
        return c;
    }

    public static void main(String[] args) {
        ComlexNumber a = new ComlexNumber(-1, 2);
        ComlexNumber b = new ComlexNumber(-2, 3);
        ComlexNumber c = Multiply(a, b);
        ComlexNumber d = Plus(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }


}
