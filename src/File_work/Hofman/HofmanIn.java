package File_work.Hofman;


public class HofmanIn {
    public static void main(String[] args) {
        MetaCharTree arr = new MetaCharTree();
        String s = "aaaaaaaaaaaaaaab";
        for (int i = 0; i < s.length(); i++) {
            arr.addCharacter(String.valueOf(s.charAt(i)));
        }

        arr.deleteWhile();
        arr.setCode();
        System.out.println(arr);
    }
}
