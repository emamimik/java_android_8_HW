package hw8;

public class Bot implements Ostacle {

    private int maxRan;
    private int maxJamp;
    private String name;

    {
        maxRan = 10000000;
        maxJamp = 50;
    }
    public Bot(String name) {
        this.name = name;
    }
    @Override
    public void ran() {
        System.out.println(name + "  Can ran");
    }
    @Override
    public void jamp() {
        System.out.println(name + "  Can jamp");
    }
    @Override
    public void obstacles() {
    }
    @Override
    public boolean jamp(int height) {
        if (height <= maxJamp) {
            System.out.println("Jamp successfully!!!");
        } return false;
    }
    @Override
    public boolean ran(int dist) {
        if (dist <= maxRan) {
            System.out.println("Ran successfully!!!");
        } return false;
    }
}



