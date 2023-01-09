package example.ex02.singleton;

public class CompanyTest {
    public static void main(String[] args) {
//        Company company1 = new Company();
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        // 두 참조 변수가 같은 변수인지 확인
        System.out.println(company1 == company2);
    }
}
