import java.util.Scanner;

public class StringOcurrance {
    public static void main(String args[]){
        //haystack = "sadbutsad", needle = "sad"
        int count=0;

        String haystack="l";
        String needle="l";
        int i=0;
        int j=needle.length();
      while(j<=haystack.length()){
          if(haystack.substring(i,j).equals(needle)){
              System.out.println(i);
          }
          i++;
          j++;
      }


    }
}
