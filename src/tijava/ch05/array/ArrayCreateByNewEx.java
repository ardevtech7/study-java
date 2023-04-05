package tijava.ch05.array;

public class ArrayCreateByNewEx {
    public static void main(String[] args) {
        // 배열 초기값
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }

        String[] strArr = new String[5];
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("strArr[" + i + "] : " + strArr[i]);
        }
    }
}
