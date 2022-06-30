package Lesson_5_Task_5;

import java.util.Scanner;

public class Creator_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = "";
        int i = 0;
        ArrCreator finder = new ArrCreator();
        for (int k = 0; k < 5; k++) {
            try {
                i = scanner.nextInt();
                x = scanner.next();
                finder.add(i, Double.parseDouble(x));
            } catch (Exception ex) {
                finder.addS(i, x);
                System.out.println(ex.getMessage());
            }
        }

        System.out.println(finder.printAll());
    }
}
