package hw3;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int answer;
        int max = 10;
        do {
            int passw = random.nextInt(max);
            boolean user = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до " + (max - 1));
                System.out.println("Попытка:" + (3 - i));
                int userNamber = sc.nextInt();
                if (userNamber > passw) {
                    System.out.println("Ваше число больше загаданного");
                }
                if (userNamber < passw) {
                    System.out.println("Ваше число меньше загаданного");
                }
                if (userNamber == passw) {
                    user = true;
                    break;
                }
            }
            if (user) {
                System.out.println("Вы угадали!!! Загаданное число = " + passw);
            } else {
                System.out.println("Вы не угадали ,загаданное число = " + passw);
            }
            System.out.println("Повторить? 1 - да");
            answer = sc.nextInt();
        } while (answer == 1);
        System.out.println("Игра окончена!");
    }
}


