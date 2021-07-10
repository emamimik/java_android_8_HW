package hw6.animal;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    int MAX_RUN;
    int MAX_SWIM;


    public Animal(){
    }
    public Animal(String name, String color, int age, int MAX_RUN, int MAX_SWIM) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.MAX_RUN = MAX_RUN;
        this.MAX_SWIM = MAX_SWIM;
    }


    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }
    public void ran() {
    }
    public void swim() {
    }
}
