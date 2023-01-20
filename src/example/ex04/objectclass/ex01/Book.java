package example.ex04.objectclass.ex01;

public class Book {
    int bookNumber;
    String bookTitle;

    public Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book = new Book(1,"가");
        System.out.println(book);
        System.out.println(book.toString());

        String str = new String("test");
        System.out.println(str);

        Integer test = new Integer(100);
        System.out.println(test);
    }
}
