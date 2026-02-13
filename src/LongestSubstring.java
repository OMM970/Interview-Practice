import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int longestSubstring(String s){
        int max =0;
        int l=0;
        int count=0;

        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;

            }
           set.add(s.charAt(i));
            count=i-l+1;
            max= Math.max(count, max);


        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(longestSubstring("bbbb"));

    }
}
