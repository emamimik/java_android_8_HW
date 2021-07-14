package hw6.animal;

import hw6.animal.Animal;

public class Cat extends Animal {

    public Cat(String name, String color, int age, int MAX_RUN, int MAX_SWIM) {
        super(name, color, age, MAX_RUN, MAX_SWIM);
    }


        @Override
        public void ran() {
            if (MAX_RUN < 200) {
                System.out.println(name + " ran " + " " + MAX_RUN + "m");
            } else {
                System.out.println("it won't run");
            }
        }

        @Override
        public void swim() {
            System.out.println(name + "  can't swim");
        }
}







