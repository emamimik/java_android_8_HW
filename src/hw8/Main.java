package hw8;

public class Main {
    public static void main(String[] args) {

        Ostacle[] rj = {
                new Cat("Vaska"),
                new Cat("Myrka"),
                new Human("Ivan"),
                new Human("Oleg"),
                new Bot("R2-D2"),
                new Bot("C-3PO"),
        };
        for (int i = 0; i < rj.length; i++) {
            rj[i].ran();
            rj[i].ran(10000000);
            rj[i].jamp();
            rj[i].jamp(70);

        }
    }
}


