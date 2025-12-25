import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MediumString {
    public static void main(String args[]){
      String str ="swiss";
      HashMap<Character,Integer> consonants=new HashMap<>();
      for(char ch : str.toCharArray()){
          consonants.put(ch,consonants.getOrDefault(ch,0)+1);


        }
      char result =0;
      for(char ch : str.toCharArray()){
          if(consonants.get(ch)==1){
              result=ch;
              break;
          }
      }

      System.out.println(result);
    }
}
