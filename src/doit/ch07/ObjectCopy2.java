package doit.ch07;

// 얕은 복사
// 객체 배열의 요소에 저장된 값은 "인스턴스 주소 값"이다.
// 즉, 객체 배열을 복사할 때, 인스턴스를 따로 생성하는 것이 아니라 기존 인스턴스의 주소 값만 복사
public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("토지", "박경리");
        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        // bookArray1 배열의 첫 번째 요소 값 변경
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("======bookArray1======");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("======bookArray2======");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}
