package tijava.ch09;

public class Button {

    // 외부에서 접근 가능하면서, Button 객체 생성 없이 사용 가능한 인터페이스
    public static interface ClickListener {
        // 추상 메소드(이 외에도 상수 필드, 디폴트 메소드, 정적 메소드 가능)
        void onClick(); // 버튼이 클릭되었을 때, 호출되는 메소드
    }

    private ClickListener clickListener;

    // 외부에서 setter 를 통해서 구현 객체를 필드에 저장
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void onClick() {
        this.clickListener.onClick();
    }
}
