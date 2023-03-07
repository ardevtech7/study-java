package example.ex06.lambda.ex08.ex3;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();
        // button 객체에 람다식(ClickListeners 익명 구현 객체) 주입
        button.setClickListener(() -> System.out.println("Button Click"));
        button.click();

        Button cancleButton = new Button();
        cancleButton.setClickListener(() -> System.out.println("Button Cancel"));
        cancleButton.click();
    }
}
