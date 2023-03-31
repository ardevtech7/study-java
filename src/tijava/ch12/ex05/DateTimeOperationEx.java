package tijava.ch12.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationEx {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 2023-03-31T23:18:22.730120

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println(now.format(dateTimeFormatter));

        LocalDateTime plusYears = now.plusYears(1);
        System.out.println("1년 덧셈 : " + plusYears.format(dateTimeFormatter));

        LocalDateTime plusMonths = now.plusMonths(1);
        System.out.println("1월 덧셈 : " + plusMonths.format(dateTimeFormatter));
    }
}
