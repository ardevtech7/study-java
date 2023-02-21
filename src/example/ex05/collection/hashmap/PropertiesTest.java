package example.ex05.collection.hashmap;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {

        Properties prop = new Properties();
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");

        Enumeration e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String element = (String) e.nextElement();
            System.out.println(element + " = " + prop.getProperty(element));
        }

        System.out.println(prop.getProperty("timeout"));
    }
}
