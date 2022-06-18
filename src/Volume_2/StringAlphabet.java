package Volume_2;


import java.util.*;

public class StringAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Set<Character> delimiters = new HashSet<>(
                Arrays.asList('.', ',', '(', ')', '?', '!', '-', '\"', '\'', ':', ';'));
        for (char i : delimiters) {
            sentence = sentence.replace(i, ' ');
        }
        while (sentence.contains("  ")) {
            sentence = sentence.replace("  ", " ");
        }
        sentence = sentence.toLowerCase().trim();
        String[] s = sentence.split(" ");
        Set<String> result = new TreeSet<>();
        Collections.addAll(result, s);
        System.out.println(result);
    }
}
