import java.util.HashMap;
import java.util.Map;

public class Stringchar {
    public static void main(String[] args) {
        String s ="Hello World";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch)==1){
                System.out.println(ch);
            }
        }
    }
}
