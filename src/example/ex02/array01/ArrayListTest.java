package example.ex02.array01;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("a","aa"));
        library.add(new Book("b","bb"));

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.showBookInfo();
        }

        System.out.println("향상된 for문");
        for (Book book : library) {
            book.showBookInfo();
        }
    }
}
