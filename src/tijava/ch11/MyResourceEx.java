package tijava.ch11;

// try-with-resource 를 사용하면, 예외 발생 여부와 상관없이 리소스를 자동으로 닫아준다.
// 단, Autocloseable 인터페이스의 close() 메소드를 재정의해야 한다.
public class MyResourceEx {
    public static void main(String[] args) {
        try(MyResource res = new MyResource("A")) {
            String data = res.read1();
            int value = Integer.parseInt(data); // value = 100
        } catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }
        System.out.println();

        try(MyResource res = new MyResource("A")) {
            String data = res.read2();
            int value = Integer.parseInt(data); // abc 변환 불가
        } catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }
        System.out.println();

        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        try(res1; res2) {
            String data1 = res1.read1();
            String data2 = res2.read2();
        } catch (Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }
    }
}
