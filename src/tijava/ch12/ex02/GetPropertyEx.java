package tijava.ch12.ex02;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {
    public static void main(String[] args) {
        // OS, 사용자 정보
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(osName);
        System.out.println(userName);
        System.out.println(userHome);

        // 전체 키와 값
        Properties properties = System.getProperties();
        Set keySet = properties.keySet();

        for(Object objKey : keySet) {
            String key = (String) objKey;
            String value = System.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}
