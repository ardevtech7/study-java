package doit.ch11.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");

        Constructor[] constructors = strClass.getConstructors();
        System.out.println("모든 생성자 가져오기");
        for (Constructor con : constructors) {
            System.out.println(con);
        }

        System.out.println("\n모든 멤버 변수 가져오기");
        Field[] fields = strClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("\n모든 메서드 가져오기");
        Method[] methods = strClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
