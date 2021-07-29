package hw10;


import java.util.*;


public class Phone {
    private Map<String, Set<String>> phoneB = new HashMap<>();

    public void add(String name, String phone) {
        Set<String> tell = phoneB.getOrDefault(name, new HashSet<>());
        tell.add(phone);
        phoneB.put(name, tell);
    }

    public Set<String> get(String name) {
        return phoneB.get(name);
    }

}
