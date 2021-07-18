package hw_dabl_8;

public class Human implements Sportable {

    private int maxRan;
    private int maxJamp;
    private String name;

    {
        maxRan = 10000;
        maxJamp = 2;
    }

    public Human(String name) {
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
