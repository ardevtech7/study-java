package example.basic.basic02;

public class LikeCount {
//    int count;
    static int count;

    public LikeCount() {
        this.count++;
        System.out.println("좋아요 개수 : " + count);
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        LikeCount likeCount1 = new LikeCount(); // 1
        LikeCount likeCount2 = new LikeCount(); // 1
        System.out.println("총 좋아요 개수 : " + LikeCount.getCount());
    }
}
