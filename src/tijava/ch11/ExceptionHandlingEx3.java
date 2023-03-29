package tijava.ch11;

public class ExceptionHandlingEx3 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) { // 0,1,2
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]의 값 : " + value );
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과 : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환 불가 : " + e.getMessage());
            } catch (Exception e) { // 상위 예외 클래스는 아래쪽에 작성
                System.out.println("실행에 문제가 있슴");
            }
        }
    }
}
