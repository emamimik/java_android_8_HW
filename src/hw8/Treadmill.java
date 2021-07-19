package hw8;

public interface Treadmill {
    default void ran() {
        System.out.println("Can ran!!!");
    }

    boolean ran(int dist);

}
