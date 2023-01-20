package example.ex05.collection.arraylist;

import example.ex05.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        memberArrayList.addMember(new Member(1,"a"));
        memberArrayList.addMember(new Member(2,"b"));
        memberArrayList.addMember(new Member(3,"c"));
        memberArrayList.showAllMember();

        memberArrayList.removeMember(1);
        memberArrayList.showAllMember();

    }
}
