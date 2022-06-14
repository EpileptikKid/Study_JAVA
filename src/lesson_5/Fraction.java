//Дополнить класс для представления простой дроби функциями перемножения дробей (статический метод)
//и возведения дроби в целую степень (нестатический метод). Добавить в функции main() ввод данных с клавиатуры

package lesson_5;

public class Fraction {
    private int n, d;

    public Fraction() {
        n = 0;
        d = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            System.err.println("Знаменатель не положительньій!");
            System.exit(1);
        }
        n = numerator;
        d = denominator;
    }

    public int getN() {
        return n;
    }

    public int getD() {
        return d;
    }

    public void set(int numerator, int denominator) {
        if (denominator <= 0) {
            System.err.println("Знаменатель не положительньій!");
            System.exit(1);
        }
        n = numerator;
        d = denominator;
    }

    public String toString() {
        return n + "/" + d;
    }

    public static Fraction sum(Fraction a, Fraction b) {
        Fraction c = new Fraction();
        c.n = a.n * b.d + a.d * b.n;
        c.d = a.d * b.d;
        c.reduce();
        return c;
    }

    protected Fraction reduce() {
        int num = n, den = d;
        while (num != den) {
            if (num > den) {
                num -= den;
            }
            else {
                den -= num;
            }
        }
        n /= num;
        d /= num;
        return this;
    }

    public static Fraction Multiply(Fraction a, Fraction b) {
        Fraction c = new Fraction();
        c.n = a.n * b.n;
        c.d = a.d * b.d;
        c.reduce();
        return c;
    }

    public Fraction Degree(int n) {
        int n1 = 1;
        int d1 = 1;
        for (int i = 1; i < n; i++) {
            n1 *= this.n;
            d1 *= d;
        }
        this.n = n1;
        d = d1;
        return this;
    }

    public static void main(String[] args) {
        Fraction a = new Fraction(10, 20);
        System.out.println("a = " + a.reduce());
        Fraction b = new Fraction(1, 3);
        b = b.Degree(3);
        System.out.println("b = " + b.reduce());
        System.out.println("a + b = " + sum(a, b));
        System.out.println("a * b = " + Multiply(a, b));
        System.out.println(a);
        System.out.println(b);
    }

}
