package hw_dabl_8;

public class Treadmill implements Exercisesable {
    int ran;

    public Treadmill(int ran) {
        this.ran = ran;
    }

    @Override
    public boolean ran(int dist) {
        return Exercisesable.super.ran(dist);
    }
}
