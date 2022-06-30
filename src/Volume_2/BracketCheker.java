package Volume_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BracketCheker {
    public static void main(String[] args) {
        Deque<Character> brackets = new ArrayDeque<>();
        String s = new Scanner(System.in).nextLine();
        boolean t = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\"') {
                t = !t;
            }
            if (s.charAt(i) == '(' && !t) {
                brackets.push('(');
            }
            if (s.charAt(i) == ')' && !t) {
                if (brackets.poll() == null) {
                    System.out.println("Строка некоректна - лишние закрьівающие скобки");
                    return;
                }
            }
        }
        if (!brackets.isEmpty() || t) {
            System.out.println("Стрика некорктна - не все скобки закрьітьі");
        } else {
            System.out.println("Строка коректна!");
        }
    }
}
