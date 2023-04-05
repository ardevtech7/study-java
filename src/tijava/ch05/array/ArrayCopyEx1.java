package tijava.ch05.array;

public class ArrayCopyEx1 {
    public static void main(String[] args) {
        int[] oldArr = {1,2,3};
        int[] newArr = new int[5];

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + ", ");
        }
    }
}
