package example.ex03.interfaceex.ex03;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("구매 주문");
    }
}
