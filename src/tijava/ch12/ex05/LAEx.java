package tijava.ch12.ex05;

import java.util.Calendar;
import java.util.TimeZone;

public class LAEx {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar now = Calendar.getInstance(timeZone);

        int hour = now.get(Calendar.HOUR);
        System.out.println(hour);

        //
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String str : availableIDs) {
            System.out.println(str);
        }
    }
}
