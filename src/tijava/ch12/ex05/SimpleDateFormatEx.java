package tijava.ch12.ex05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        String format1 = simpleDateFormat.format(date);
        System.out.println(format1);
    }
}
