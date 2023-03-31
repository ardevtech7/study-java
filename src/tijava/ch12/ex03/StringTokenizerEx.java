package tijava.ch12.ex03;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String data1 = "홍길동&이순신,유관순";
        String[] arr = data1.split("&|,");
        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        String data2 = "홍길동/이순신/유관순";
        StringTokenizer st = new StringTokenizer(data2, "/");
        while (st.hasMoreTokens()) { // 남아 있는 문자열이 있는지 확인
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
