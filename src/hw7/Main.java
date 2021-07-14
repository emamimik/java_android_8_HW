package hw7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Vaska", 7),
                new Cat("Barsic", 12),
                new Cat("Chernysh", 10)
        };
        Plate plate = new Plate(21);
        plate.info();
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
        }
    }
}
