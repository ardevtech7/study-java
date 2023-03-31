package tijava.ch12.ex03;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 *  한글 1글자
 *  - UTF-8로 인코딩하면, 3Byte
 *  - EUC-KR, 2Byte
 *  --> 인코딩한 문자셋으로 디코딩도 동일하게 적용
 */
public class BytesToStringEx {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data = "자바";

        // String -> byte 배열 (기본 UTF-8 인코딩)
        byte[] bytesArray = data.getBytes(); // "UTF-8"
        System.out.println("bytesArray : " + Arrays.toString(bytesArray));

        // byte 배열 -> String (기본 UTF-8 디코딩)
        String decodedBytesArray = new String(bytesArray); // bytesArray, "UTF-8"
        System.out.println("decodedBytesArray : " + decodedBytesArray);

        // String -> byte 배열 (EUC-KR 인코딩)
        byte[] bytesArray2 = data.getBytes("EUC-KR");
        System.out.println("bytesArray2 : " + Arrays.toString(bytesArray2));

        String decodedBytesArray2 = new String(bytesArray2, "EUC-KR");
        System.out.println("decodedBytesArray2 : " + decodedBytesArray2);
    }
}
