package algorithm.ex01;

// 재귀 함수
public class RecurSum {
    static int sum(int n) {
        // n이 1이하일 때, 재귀함수를 종료하고 1을 리턴
        if (n <= 1) {
            return 1;
        }
        return n + sum(n-1);
        // (순회) 5 + sum(4) -> sum(4)의 결과값을 반환받아야 한다. (상위 과정으로 돌아가기) 5 + 10 = 15 (처음 호출했던, 함수까지 올라간다)
        // (순회) 4 + sum(3) -> sum(3)의 결과값을 반환받아야 한다. (상위 과정으로 돌아가기) 4 + 6 = 10
        // (순회) 3 + sum(2) -> sum(2)의 결과값을 반환받아야 한다. (상위 과정으로 돌아가기) 3 + 3 = 6
        // (순회) 2 + sum(1) -> sum(1)의 결과값을 반환받아야 한다. (상위 과정으로 돌아가기) 2 + 1 = 3
        // (순회) n <= 1, return 1 반환

        // 재귀 함수는 최종적으로 값이 반환되면, 더 이상 순회하지 않고,상위 과정으로 돌아간다.
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
