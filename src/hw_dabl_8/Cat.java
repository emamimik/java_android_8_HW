package hw_dabl_8;

public class Cat implements Sportable {

    private int maxRan;
    private int maxJamp;
    private String name;

    {
        maxRan = 100;
        maxJamp = 4;
    }

    public Cat(String name) {
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
