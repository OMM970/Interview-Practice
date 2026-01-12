import java.util.HashSet;
import java.util.Set;

public class Threesubs {
    public static void main(String[] args) {
        String s = "xyzzaz";
        StringBuilder sc =new StringBuilder(s);
        sc.reverse();
        int n=s.length();
//        int i=0;
        int j = 0;
        int size = 3;
        int count = 0;
      for(int i=0;i<n-3;i++){
          Set<Character> set = new HashSet<Character>();

          set.add(s.charAt(i));
          set.add(s.charAt(i+1));
          set.add(s.charAt(i+2));
          if(set.size()==3){
              count++;
          }

      }
      System.out.println(count);
    }
}

