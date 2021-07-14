package hw7;

public class Cat {
    private String name;
    private int appetit;
    private boolean hungry;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.hungry = true;
    }


    public void info () {
        String isHungry = !hungry ? "I'm ful!" : "I'm hungry!";
        System.out.println(name + ": " + isHungry);
    }

    public void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetit))
            hungry = false;
        plate.decreaseFood(appetit);
    }
}
