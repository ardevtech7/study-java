package example.ex07.exception;

import java.io.FileNotFoundException;

public class ThrowsExceptionTest {
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
