package hw_dabl_8;

public class Bot implements Sportable {
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
    public void jamp() {
        System.out.println(name + "  Can jamp");
    }

    @Override
    public void ran() {
        System.out.println(name + "  Can ran");

    }

}
