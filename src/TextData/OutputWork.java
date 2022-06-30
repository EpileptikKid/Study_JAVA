package TextData;

import java.util.Formatter;

public class OutputWork {
    public static void main(String[] args) {
        System.out.printf("%x ", 100);
        System.out.printf("%o%n", 100);
        double i = 100000.0;
        while (i < 10000000) {
            System.out.printf("%g ", i);
            i += 100000;
        }
        System.out.println();
        Formatter f = new Formatter();
        f.format("%-12.4f", 123123.123123);
        System.out.println(f);
        f = new Formatter();
        f.format("%-12.4f", 123123.333333);
        System.out.println(f);
        f = new Formatter();
        f.format("%-12.4f", 1212342134678673123.3444433333);
        System.out.println(f);
        f = new Formatter();
        f.format("%-12.4f", 1231.34239233333);
        System.out.println(f);
        f = new Formatter();
        f.format("%-12.4f", 1233.3);
        System.out.println(f);
    }

}
