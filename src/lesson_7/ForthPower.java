package lesson_7;

import java.util.Scanner;

public class ForthPower {


    public static class EquationError extends Exception {
        double x;

        public void printError() {
            System.out.println("Wrong data!");
            System.out.println(x);
            System.exit(1);
        }

        EquationError(double x) {
            this.x = x;
        }
    }

    static double sqrt4(double x) throws EquationError {
        if (x < 0) {
            throw new EquationError(x);
        }
        return Math.sqrt(Math.sqrt(x));
    }

    public static void main(String[] args) throws EquationError {
        Scanner scanner = new Scanner(System.in);

        try {
            double n = scanner.nextDouble();
            System.out.println(sqrt4(n));
        }
        catch (ForthPower.EquationError err) {
            err.printError();
        }

    }

}
