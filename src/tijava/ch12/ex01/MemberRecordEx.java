package tijava.ch12.ex01;

public class MemberRecordEx {
    public static void main(String[] args) {
        MemberRecord memberRecord = new MemberRecord("홍길동", 10);
        MemberRecord memberRecord1 = new MemberRecord("홍길동", 10);

        // get 메소드 자동 호출
        System.out.println(memberRecord.age());
        System.out.println(memberRecord.name());
        System.out.println(memberRecord);

        System.out.println(memberRecord.equals(memberRecord1));
    }
}
