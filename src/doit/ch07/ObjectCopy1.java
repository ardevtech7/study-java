package doit.ch07;

// 객체 배열 복사
public class ObjectCopy1 {
    public static void main(String[] args) {
        Book[] library = new Book[3];
        Book[] libraryCopy = new Book[3];

        library[0] = new Book("태백산맥", "조정래");
        library[1] = new Book("데미안", "헤르만 헤세");
        library[2] = new Book("토지", "박경리");
        System.arraycopy(library, 0, libraryCopy, 0, 3);

        for (int i = 0; i < libraryCopy.length; i++) {
            libraryCopy[i].showBookInfo();
        }
    }
}
