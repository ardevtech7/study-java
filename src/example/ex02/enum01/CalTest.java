package example.ex02.enum01;

import java.util.Calendar;

public class CalTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        System.out.println(year + "," + month);
    }
}
