package TextData;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMaskFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print text");
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("[ab]ps\\w*\\.(png|jpeg|psd)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group() + " " + matcher.start());
        }
    }
}
