package tijava.ch12.ex04;

/*
Math 클래스는 최상위 클래스인 Object 클래스 안에 있으므로 따로 Import를 시켜주지 않아도 사용이 가능
Math.random()메소드도 static 메소드로 이루어져있기에 바로 호출할 수 있습니다.
Math.random()의 메소드는 시드값으로 현재시간을 사용하므로 매번 실행시킬 때마다 다른 숫자가 출력됩니다.
Math.random() 메서드를 실행하면 실수형의 0.0 ~ 1.0 미만 사이의 무작위 실수값이 하나 리턴됩니다.
 */
public class MaxRandomEx {
    public static void main(String[] args) {
        System.out.println("0.1 ~ 1.0 사이의 난수 : " + Math.random());
        System.out.println("0 ~ 10 사이의 난수 1개 발생 : " + (int)(Math.random() * 10));
        System.out.println("0 ~ 100 사이의 난수 1개 발생 : " + (int)(Math.random() * 100));
        System.out.println("0 ~ 1000 사이의 난수 1개 발생 : " + (int)(Math.random() * 1000));

    }
}
