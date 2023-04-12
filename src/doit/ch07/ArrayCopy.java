package doit.ch07;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {10,20,30,40,50};

        // 복사할 배열, 복사할 배열의 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수
        System.arraycopy(arr1, 2, arr2,1, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
