import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] words = {"голик", "волейболистка", "румпель", "коллективность", "подкупание", "экспортёр", "румпель", "невыдержанность", "рослость", "заманчивость", "герцог", "твердомер",};

        Map<String, Integer> map = new HashMap<>();//посчитать слова
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println(map.keySet());//вывести слова которые не повторяются

        // Телефонный справочник.
        phoneDirectory phoneDirectory = new phoneDirectory();

        phoneDirectory.add("Иванов", "+375254567345");
        phoneDirectory.add("Петров", "+375257567946");
        phoneDirectory.add("Сидоров", "+375294794673");
        phoneDirectory.add("Ковальчуков", "+375294578345");
        phoneDirectory.add("Козлов", "+375331234567");
        phoneDirectory.add("Иванов", "+375297645678");

        String lastName = "Иванов";
        System.out.println(phoneDirectory.get(lastName));
    }
}

class phoneDirectory {
    private Map<String, HashSet<String>> map;

    phoneDirectory() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phoneNumber) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        map.put(lastName, numbers);
    }

    Set<String> get(String lastName) {
        System.out.println(lastName);
        return map.get(lastName);
    }
}