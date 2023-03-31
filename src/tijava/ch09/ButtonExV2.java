package tijava.ch09;

public class ButtonExV2 {
    public static void main(String[] args) {
        Button button = new Button();
        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼 클릭");
            }
        });

        button.onClick();

        //---------------------------------------------------------------
        // 취소 버튼
        Button buttonCancel = new Button();

        buttonCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭");
            }
        });

        buttonCancel.onClick();
    }
}
