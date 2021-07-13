package hw6;

import hw6.animal.Animal;
import hw6.animal.Cat;
import hw6.animal.Dog;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Vaska", "blac", 2, 150, 0),
                new Dog("Baikal", "Grey", 7, 150, 9)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].info();
            animals[i].ran();
            animals[i].swim();

        }

    }

}



