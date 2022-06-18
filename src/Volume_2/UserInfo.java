package Volume_2;

import java.util.Map;
import java.util.Properties;



public class UserInfo {
    public static void main(String[] args) {
        Properties info = new Properties();
        info.setProperty("arnold", "123456");
        info.setProperty("dima", "12345");
        info.setProperty("vitalif", "1234567");
        info.setProperty("ira", "12345678");
        info.setProperty("misha", "123");
        for (Map.Entry<?, ?> entry : info.entrySet()) {
            if (entry.getValue().toString().length() >= 6) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
