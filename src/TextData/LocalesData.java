package TextData;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LocalesData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double data = scanner.nextDouble();
        Locale[] list = NumberFormat.getAvailableLocales();
        for (Locale locale : list) {
            NumberFormat from = NumberFormat.getInstance(locale);
            System.out.println(from.format(data));
        }
    }
}
