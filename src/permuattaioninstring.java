import java.util.HashMap;
import java.util.Scanner;

public class permuattaioninstring {
    public static void main(String args[]){
        System.out.print(isPermutation("hello","ooolleoooleh"));

    }
    public static boolean isPermutation(String s1,String s2){
        HashMap<Character,Integer> mapstr1=new HashMap<>();



        for(int i=0;i<=s1.length()-1;i++){
            mapstr1.put(s1.charAt(i),mapstr1.getOrDefault(s1.charAt(i),0)+1);
        }
        int l=0;
        int r=s1.length();
      while(r<=s2.length()){
          HashMap<Character,Integer> mapstr2=new HashMap<>();

          for(int i=l;i<=r-1;i++){
              if(mapstr1.containsKey(s2.charAt(i))){
                  mapstr2.put(s2.charAt(i),mapstr2.getOrDefault(s2.charAt(i),0)+1);
              }
          }
          System.out.println(mapstr2);
          if(mapstr1.equals(mapstr2)){
              return true;
          }
          l++;
          r++;

      }
      return false;

    }
}
