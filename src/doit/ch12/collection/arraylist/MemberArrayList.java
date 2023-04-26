package doit.ch12.collection.arraylist;

import doit.ch12.collection.Member;

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

    // 회원 삭제 (member id로 회원 조회하고, 삭제)
    public boolean removeMemberV1(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            // 회원을 순차적으로 가져온다.
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();

            // 회원 아이디가 memberId 와 같은지 확인한다.
            if (tempId == memberId) {
                // 같으면, 해당 아이디를 삭제한다.
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public boolean removeMemberV2(int memberId) {
        Iterator<Member> iterator = arrayList.iterator(); // Iterator 반환
        while (iterator.hasNext()) {
            Member member = iterator.next();
            int tempId = member.getMemberId();

            if (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    // 모든 회원 출력
    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }

    // 특정 위치에 회원 추가
    public void insertMember(Member member, int index) {
        if (index < 0  || index > arrayList.size() + 1) {
            System.out.println("인덱스 범위를 올바르게 입력하세요");
            return;
        }
        arrayList.add(index-1, member);
    }
}
