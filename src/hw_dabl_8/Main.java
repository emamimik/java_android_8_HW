package hw_dabl_8;

public class Main {
    public static void main(String[] args) {
        Sportable[] jr = {
                new Human("Valera"),
                new Human("Vasya"),
                new Cat("Barsik"),
                new Cat("Murzik"),
                new Bot("111A999"),
                new Bot("333R555"),
        };
        Exercisesable[] wt = {
                new Wall(10),
                new Wall(3),
                new Treadmill(20),
                new Treadmill(100000),

        };
        for (int i = 0; i < wt.length; i++)
            for (int j = 0; j < jr.length; j++) {
                if (wt[i] <= maxRan && wt[i] <= )


                //jr[i].ran();
                //jr[i].jamp();

                //if (i <= maxRan && j <= maxJmp) {
               //     System.out.println(" jnv");
               // }else {
               //     System.out.println("jbcwp");
               // }



        }
    }
}
