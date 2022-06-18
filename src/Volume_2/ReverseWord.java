package Volume_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Deque<Character> temp = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            temp.push(s.charAt(i));
        }
        Character ch;
        while (!temp.isEmpty()) {
            ch = temp.pop();
            System.out.print(ch);
        }

    }
}
