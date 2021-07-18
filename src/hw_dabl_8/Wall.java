package hw_dabl_8;

public class Wall implements Exercisesable{
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean jamp(int height) {
        return Exercisesable.super.jamp(height);
    }
}
