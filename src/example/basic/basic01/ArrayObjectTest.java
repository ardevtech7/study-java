package example.basic.basic01;

public class ArrayObjectTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ArrayObject arrayObject = new ArrayObject(array);

        for (int num : arrayObject.getArray()) {
            System.out.print(num);
        }

        System.out.println();
        array[0] = 7; // arrayObject 의 배열 값은 변하지 않음
        for (int num : arrayObject.getArray()) {
            System.out.print(num);
        }

    }
}
