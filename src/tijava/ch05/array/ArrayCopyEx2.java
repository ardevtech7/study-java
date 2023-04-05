package tijava.ch05.array;

public class ArrayCopyEx2 {
    public static void main(String[] args) {
        int[] oldArr = {1,2,3};
        int[] newArr = new int[5];

        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
    }
}
