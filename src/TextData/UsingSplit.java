package TextData;

import java.util.Scanner;

public class UsingSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split("\\s");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
