package Volume_2;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class CharStat {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        SortedMap<Character, Integer> stat = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (stat.containsKey(str.charAt(i))) {
                int n = stat.get(str.charAt(i));
                stat.remove(str.charAt(i));
                stat.put(str.charAt(i), n + 1);
            } else {
                stat.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<?, ?> entry : stat.entrySet()) {
            System.out.println("\"" + entry.getKey() + "\" - " + entry.getValue());
        }
    }
}
