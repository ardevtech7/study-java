package basicalgorithm.ex01;

public class BitOperation
{
    // 임의의 숫자 num 과 가져올 index 번호 i
    static boolean getBit(int num, int i) {
        // 1을 i만큼 Left Shift
        // 그 값을 num 값과 end 연산을 했을 때 나오는 값이 0이 아니면 true 반환
        return (num & (1 << i)) != 0;
    }

    // 임의의 숫자 num의 i번째 인덱스에 해당하는 비트값을 1로 셋팅
    /*
        num = 9
        i = 3
          1 0 0 1 (9)
        | 1 0 0 0
        -------------
          1 0 0 1
     */
    static int setBit(int num, int i) {
        return (num | (1 << i));
    }

    // 해당 자리수를 무조건 0으로 셋팅
    /*
        1 0 0 0 = 1 << 3
        0 1 1 1 = ~ 1 0 0 0

        num = 9
        i = 3
          1 0 0 1 (9)
        & 0 1 1 1
        -------------
          0 0 0 1
     */
    static int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

    // 해당 인덱스를 시작으로 왼쪽에 있는 비트들을 전부 0으로 만들기
    /*
        1 0 0 0 = 1 << 3
        0 1 1 1 = 1 0 0 0 - 1
     */
    static int clearLeftBits(int num, int i) {
        return num & ((1 << i) - 1);
    }

    // 모든 비트들을 1로 셋팅하고, 인덱스를 시작으로 오른쪽에 있는 비트들을 전부 0으로 만들기
    /*
        모든 비트가 1인 것은 -1
        1 1 1 .. 1 1 1 = -1
        이 숫자를 인덱스만큼 Left Shift 하면, 새로 들어가는 비트들은 0.
        인덱스를 포함해서 0을 만들어야하니 인덱스에 1을 더해서 왼쪽으로 밀어주면 0이 4개 생성
        1 1 1 .. 0 0 0 = -1  << (3 + 1)
     */
    static int clearRightBits(int num, int i) {
        return num & (-1 << (i + 1));
    }

    // 해당 인덱스를 val 로 업데이트
    /*
        해당 비트를 clear 한 후에 값을 더한다.
          x x x x x x x
        & 1 1 1 0 1 1 1
        ----------------
          x x x 0 x x x
        | 0 0 0 y 0 0 0
        ----------------
          x x x y x x x
     */
    static int updateBit(int num, int i, boolean val) {
        return num & ~(1 << i) | ((val ? 1 : 0) << i);
    }

    public static void main(String[] args) {
        // 숫자 9(1 0 0 1)의 3번 인덱스 비트값 확인
        System.out.println(getBit(9, 3));
        // 0 1 0 1
        System.out.println(getBit(5, 3));

        // 0 1 0 1 | 1 0 0 0 => 1 1 0 1
        System.out.println(setBit(5, 3));

        System.out.println(clearBit(9, 3));

        System.out.println(clearLeftBits(169, 3));

        System.out.println(clearRightBits(169, 3));

        // 10101001 -> 10100001
        System.out.println(updateBit(169, 3, false));
    }
}

