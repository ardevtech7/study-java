package example.ex05.collection.arraylist;

import example.ex05.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    // 회원 추가
    public void addMember(Member member) {
        arrayList.add(member);
    }

    // 회원 삭제
//    public boolean removeMember(int memberId) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            int tempId = member.getMemberId();
//            if (memberId == tempId) {
//                arrayList.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId + "가 존재하지 않습니다.");
//        return false;
//    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 전체 회원 출력
    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }

}
