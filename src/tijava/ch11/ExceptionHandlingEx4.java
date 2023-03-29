package tijava.ch11;

public class ExceptionHandlingEx4 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) { // 0,1,2
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]의 값 : " + value );
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과 : " + e.getMessage());
            } catch (NullPointerException | NumberFormatException e) { // 두 개 이상의 예외 하나의 블럭에서 처리
                System.out.println("데이터에 문제가 있음 : " + e.getMessage());
            } catch (Exception e) { // 상위 예외 클래스는 아래쪽에 작성
                System.out.println("실행에 문제가 있슴");
            }
        }
    }
}
