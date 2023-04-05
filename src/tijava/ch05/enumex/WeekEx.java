package tijava.ch05.enumex;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {
        // Week 열거 타입 변수 선언
        Week today = null;

        // Calendar 객체 얻기
        Calendar cal = Calendar.getInstance();

        // 오늘의 요일 얻기 (1(일) ~ 7(토))
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today= Week.MONDAY;
                break;
            case 3:
                today= Week.TUESDAY;
                break;
            case 4:
                today= Week.WEDNESDAY;
                break;
            case 5:
                today= Week.TUESDAY;
                break;
            case 6:
                today= Week.FRIDAY;
                break;
            case 7:
                today= Week.SATURDAY;
                break;
        }

        if (today == Week.SUNDAY) {
            System.out.println("영화보기");
        } else {
            System.out.println("자바 공부");
        }
    }
}
