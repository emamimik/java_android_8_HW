package hw1;

public class JavaApp {
    public static void main(String[] args) {
        // создание переменных пройденных типов данных
        byte b = -93;
        short s = 12;
        int a = 10;
        long l = 123456789012345L;
        float f = 12.23f;
        double d = 0.12;
        char c = 'a';
        char h = '\u1234';
        boolean g;
        g = true;
        g = false;
        String string = "Hello";

        // задания с 3 по 7

        metod1(1.1f, 0.3f, 12.4f, 2.2f);

        metod2(1, 2);

        metod3(4);
        if (true) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        metod5("Сергей");
    }

    public static float metod1(float a, float b, float c, float d) {

        return a * (b + c / d);
    }

    public static boolean metod2(int a, int b) {

        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static boolean metod3(int a) {

        return a % 2 == 0;
    }

    public static boolean metod4(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void metod5(String name) {
        System.out.println("Привет" + "," + " " + name);
    }
}
