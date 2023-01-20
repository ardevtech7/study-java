package example.ex04.objectclass.ex03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class strClass = Class.forName("java.lang.String");

        Constructor[] constructors = strClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("----------------------");
        Field[] fields = strClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

}
