package example.ex07.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        Class aClass = Class.forName(className);
        return aClass;
    }
}
