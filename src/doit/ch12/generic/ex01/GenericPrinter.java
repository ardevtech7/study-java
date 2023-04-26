package doit.ch12.generic.ex01;

public class GenericPrinter<T extends Material> {
    private T material; // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
