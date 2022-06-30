package TextData;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;

public class UsingIterator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        CharacterIterator it = new StringCharacterIterator(str);
        int position = scanner.nextInt();
        for (char ch = it.setIndex(position); ch != CharacterIterator.DONE; ch = it.previous()) {
            System.out.print(ch);
        }
    }

}
