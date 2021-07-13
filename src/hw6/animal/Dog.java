package hw6.animal;

import hw6.animal.Animal;

public class Dog extends Animal {
    public Dog(String name, String color, int age, int MAX_RUN, int MAX_SWIM) {
        super(name, color, age, MAX_RUN, MAX_SWIM);
    }

    @Override
    public void ran() {
        if (MAX_RUN <= 500) {
            System.out.println(name + "ran " + " " + MAX_RUN + "m");
        } else {
            System.out.println("it won't run");
        }
    }

    @Override
    public void swim() {
        if (MAX_SWIM <= 10){
        System.out.println(name + "swim " + " " + MAX_SWIM + "m");
        } else  { System.out.println(name + "  can't swim");
        }
    }
}