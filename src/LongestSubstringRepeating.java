import java.util.Collections;
import java.util.HashMap;

public class LongestSubstringRepeating {
    public static int longestSubstring(String s,int k){
        HashMap<Character,Integer> map = new HashMap<>();
       int MAxlength=0;
        int l=0;
        int r=0;
       while(r<s.length()){
           map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
          int  max=Collections.max(map.values());
           while((r - l + 1) - Collections.max(map.values()) > k){

               char ls = s.charAt(l);

               map.put(ls, map.get(ls) - 1);

               if(map.get(ls) == 0){
                   map.remove(ls);
               }

               l++;
           }
          MAxlength=Math.max(MAxlength,r - l + 1);
          r++;




       }
       return MAxlength;
    }
    public static void main(String[] args) {
        System.out.println(longestSubstring("aababba",1));
    }
}
