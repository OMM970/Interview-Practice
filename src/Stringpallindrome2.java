import java.util.Arrays;
import java.util.Scanner;

public class Stringpallindrome2 {
    public static void main(String args[]){
        String str="Ganga";
        str=str.toLowerCase();
        String str2="angga";
        char [] arr=str.toCharArray();
        char [] ar2=str2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(ar2);
        String str3=String.valueOf(arr);
        String str4=String.valueOf(ar2);
        if(str3.equals(str4)){
            System.out.println("the string is anagram");
        }
        else{
            System.out.println("you fail the interview");
        }



    }
}
