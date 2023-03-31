package tijava.ch09;

public class ButtonEx {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        Button button = new Button();

        // OK 버튼 클릭 이벤트를 처리할 구현 클래스
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼 글릭");
            }
        }

        button.setClickListener(new OkListener());
        button.onClick();

        //---------------------------------------------------------------
        // 취소 버튼
        Button buttonCancel = new Button();

        // 취소 버튼 클릭 이벤트 처리 구현 클래스
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭");
            }
        }

        buttonCancel.setClickListener(new CancelListener());
        buttonCancel.onClick();
    }
}
