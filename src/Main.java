import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();
        String[] words = s.split(" ");
       for(int i=words.length-1;i>=0;i--){
           System.out.println(words[i]);


       }
    }
}