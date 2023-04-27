package doit.ch12.collection.hashmap;

import doit.ch12.collection.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    // key 값에 쓰인 Inte+ger 클래스는 equals(), hashCode() 메서드가 이미 재정의
    // Integer 클래스에 정렬 인터페이스 이미 구현되어 있음
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<>();
    }

    public void addMember(Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    /*
        Map 인터페이스는 모든 자료를 한 번에 순회할 수 있는 방법이 없다.
        모든 자료를 순회하려면 key 값을 먼저 가져와서, key 값에 해당하는 value 를 찾아야 한다.
     */
    public void showAllMember() {
        Iterator<Integer> iterator = treeMap.keySet().iterator();

        while (iterator.hasNext()) {
            int key = iterator.next(); // key 값을 가져온다.
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
