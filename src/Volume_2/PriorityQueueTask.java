package Volume_2;

import java.util.*;

public class PriorityQueueTask {
    public static void main(String[] args) {
        Queue<Double> set = new PriorityQueue<>(Comparator.comparingDouble(Math::abs));

        Scanner scanner = new Scanner(System.in);
        double k;
        for (int i = 0; i < 10; i++) {
            k = scanner.nextDouble();
            set.add(k);
        }

        Double n = 0.0;
        Integer x = 1;
        for (Double j : set) {
            n += j;
            x++;
        }
        System.out.println("Middle ariphmetical - " + (Double) (n / x));
        System.out.println("Array:");

        Double k1;
        while ((k1 = set.poll()) != null) {
            System.out.print(k1 + " ");
        }
    }
}
