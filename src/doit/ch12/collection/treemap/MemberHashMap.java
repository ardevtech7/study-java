package doit.ch12.collection.treemap;

import doit.ch12.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    // key 값에 쓰인 Integer 클래스는 equals(), hashCode() 메서드가 이미 재정의
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
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
        // hashMap.keySet() 메서드를 호출하면, 모든 key 값이 Set 객체로 반환
        // 반환된 Set 객체에 iterator() 메소드를 호출하면, key 를 순회할 수 있는 Iterator 가 반환
        Iterator<Integer> iterator = hashMap.keySet().iterator();

        while (iterator.hasNext()) {
            int key = iterator.next(); // key 값을 가져온다.
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
