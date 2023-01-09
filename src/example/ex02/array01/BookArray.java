package example.ex02.array01;

public class BookArray {
    public static void main(String[] args) {
        /*
            - Book 클래스형으로 객체 배열 생성
            - 인스턴스를 생성하면, 그 인스턴스를 가리키는 주소 값이 있다.
                -> 아래 처럼 생성하는 것은 Book 인스턴스 주소값을 담을 공간 5개를 생성한다는 의미
         */
        Book[] library = new Book[2];

        // 각 배열 요소에 인스턴스 생성
        library[0] = new Book("a","aa");
        library[1] = new Book("b","bb");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]); // Book 인스턴스를 저장한 메모리 공간 주소
            library[i].showBookInfo();
        }
    }
}
