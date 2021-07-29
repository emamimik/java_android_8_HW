package hw10;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] any = {"a", "b", "c", "d", "g", "a", "a", "c", "g", "d", "d"};
        System.out.println(Arrays.toString(any));

        HashMap<String, Integer> hmap = new HashMap<>();
        for (String x : any) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

        Phone phoneB = new Phone();
        phoneB.add("Ivanov", "22222");
        phoneB.add("Petrov", "1111111");
        phoneB.add("Sidorov", "3333333");
        phoneB.add("Ivanov", "4444444");
        phoneB.add("Ivanov", "5555555");
        phoneB.add("Petrov", "7777777");

        System.out.println("Tell :" + phoneB.get("Ivanov"));
        System.out.println("Tell :" + phoneB.get("Sidorov"));
        System.out.println("Tell :" + phoneB.get("Petrov"));
    }
}
