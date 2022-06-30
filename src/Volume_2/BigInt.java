package Volume_2;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger a = new BigInteger(n, new Random());
        System.out.println(a);
        System.out.println(a.pow(2));
        BigInteger result;
        result = a;
        for (int i = 0; i < 1; i++) {
            result = result.multiply(a);
        }
        System.out.println(result);
    }

}
