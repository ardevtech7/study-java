package doit.ch07;

public class BookArray {
    public static void main(String[] args) {
        // Book 클래스형으로 객체 배열 생성
        Book[] library = new Book[3];

        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데미안", "헤르만 헤세");
        library[2] = new Book("토지", "박경리");

        // 객체 배열 출력
        for (int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }

        System.out.println();
        // Book 인스턴스를 저장한 메모리 공간 주소
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }


    }
}
