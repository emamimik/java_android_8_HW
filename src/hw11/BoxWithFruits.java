package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxWithFruits <T extends Fruct> {
    private List<T> container;

    public BoxWithFruits() {
        this.container = new ArrayList<>();
    }

    public BoxWithFruits(T... fruits) {
        this.container = new ArrayList(Arrays.asList(fruits));
    }

    public float getWeight() {
        float w = 0;
        for (T fruit : container) {
            w += fruit.getWeight();
        }
        return w;
    }
    public boolean sameAwg(BoxWithFruits<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.001;
    }
    public void transfer(BoxWithFruits<? super T> another) {
        if (another == this) {
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }
    public void add(T fruit) {container.add(fruit);}

}
