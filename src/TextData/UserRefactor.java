package TextData;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRefactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("print test - ");
        String str = scanner.nextLine();
        Pattern pattern = Pattern.compile("user\\w*\\\\user");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String s = matcher.group();
            String res = s.replaceAll("user", "");
            res = res.replaceAll("\\\\", "");
            str = str.replace(s, "<a href=\"https://www.my.by/search.htm?param=" + res + "\">" + res + "</a>");
        }
        System.out.println(str);
    }
}
