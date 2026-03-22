import java.util.HashMap;

public class Aliean {
    public static void main(String[] args){
        String order = "31";
        String[] words={"3"};
        System.out.println(alienDictonary(words.length,words,order));

    }
    public static Boolean alienDictonary(int n, String words[], String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i), i);
        }
        for(int i=0;i<n-1;i++){
            if(!compareValid(words[i],words[i+1],map)){
                return false;
            }

        }
        return true;

    }
    public static Boolean compareValid(String w,String w2,HashMap<Character, Integer> map){
        int j=0;
        while(j<w.length() && j<w2.length()){
           char c1 = w.charAt(j);
           char c2 = w2.charAt(j);
           if(c1!=c2){
               return map.get(c1)<map.get(c2);
           }

            j++;
        }
        return map.get(w.charAt(j))>map.get(w2.charAt(j));

    }

}
