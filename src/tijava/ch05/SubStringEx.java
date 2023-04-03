package tijava.ch05;

public class SubStringEx {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        String firstNum = ssn.substring(0, 6); // 0 ~ 5
        String secondNum = ssn.substring(7); // 7 ~ 끝까지

        System.out.println(ssn);
        System.out.println(firstNum);
        System.out.println(secondNum);
    }
}
