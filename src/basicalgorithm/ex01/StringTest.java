package basicalgorithm.ex01;

// 주어진 개수의 모든 가능한 문자열 조합 중 정렬된 것만 출력
public class StringTest {
    public static final int C = 26; // 알파벳 개수
    public static void main(String[] args) {
        printSortedStrings(2);
    }

    private static void printSortedStrings(int k) {
        printSortedStrings(k, "");
    }

    private static void printSortedStrings(int k, String prefix) {
        if (k == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < C; i++) {
                char c = ithLetter(i);
                printSortedStrings(k - 1, prefix + c);
            }
        }
    }

    private static boolean isInOrder(String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));

            if (prev > curr) { // 정렬이 아닌 것
                return false;
            }
        }
        return true;
    }

    private static char ithLetter(int i) {
        return (char) (((int) 'a') + i);
    }
}
