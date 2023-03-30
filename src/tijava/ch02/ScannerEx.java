package tijava.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력 : ");
//        int x = scanner.nextInt();// int 로 읽기
        String strX = scanner.nextLine(); // 문자열로 읽기
        int x = Integer.parseInt(strX); // int 로 변환

        System.out.print("y 값 입력 : ");
        String strY = scanner.nextLine(); // 문자열로 읽기
        int y = Integer.parseInt(strY); // int 로 변환
//        int y = scanner.nextInt();// int 로 읽기


        int result = x + y;
        System.out.println("x + y = " + result);

        while (true) {
            System.out.print("문자열 입력 : ");
            String str = scanner.nextLine();
            if (str.equals("q")) { // 문자열 동등 비교 : equal(), 기본 타입 비교 : ==
                break;
            }
            System.out.println("문자열 출력 : " + str);
            System.out.printf("");
        }
        System.out.println("종료");
    }
}
