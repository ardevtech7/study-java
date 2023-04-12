package doit.ch07;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList 는 객체 배열이므로 각 인스턴스를 생성해서 배열의 요소로 추가
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 헤세"));
        library.add(new Book("토지", "박경리"));

        for (int i = 0; i < library.size(); i++) {
            // ArrayList 에 있는 인스턴스를 순서대로 가져와서 출력
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println("[ 향상된 For문 ]");
        for (Book book : library) {
            book.showBookInfo();
        }

    }
}
