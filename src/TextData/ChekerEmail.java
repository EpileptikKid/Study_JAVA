package TextData;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekerEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print e-mail - ");
        String email = scanner.next();
        Pattern pattern = Pattern.compile("[A-Za-z]\\w*@(\\w+\\.)+[a-z]+");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("correct");
        } else {
            System.out.println("error");
        }
    }
}
