package hw8;

public interface Wall {
    default void jamp() {
        System.out.println("Can jamp!!!");
    }

    boolean jamp(int height);
}
