package TextData;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print test");
        String str = scanner.nextLine();
        System.out.println("Print template");
        String template = scanner.nextLine();
        Pattern pattern = Pattern.compile(template);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.printf("\"%s\" - start position - " + "%d, end position - %d%n", matcher.group(), matcher.start(), matcher.end());
        }
    }
}
