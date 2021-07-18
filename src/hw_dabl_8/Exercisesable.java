package hw_dabl_8;

public interface Exercisesable {
    default boolean jamp(int height) {
        return false;
    }
    default boolean ran(int dist) {
        return false;
    }
}
