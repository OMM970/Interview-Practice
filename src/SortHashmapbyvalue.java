import java.util.HashMap;
import java.util.Map;

public class SortHashmapbyvalue {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('a',1);
        map.put('g',2);
        map.put('k',3);
        map.put('d',4);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
