package tijava.ch12.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareEx {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime startDateTime = LocalDateTime.of(2021,1,1,0,0,0);
        System.out.println("시작일 : " + startDateTime);

        LocalDateTime endDateTime = LocalDateTime.of(2021,12,31,0,0,0);
        System.out.println("종료일 : " + endDateTime);

        // 비교
        if (startDateTime.isBefore(endDateTime)) {
            System.out.println("진행중");
        } else if (startDateTime.isEqual(endDateTime)) {
            System.out.println("종료");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("종료했습니다.");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        System.out.println(remainYear);
        System.out.println(remainMonth);
    }
}
