import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SingleLinkedlist {
    public static void main(String args[]){
        Set<Character> set = new HashSet<Character>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        set.add(str.charAt(0));
        for(char c : set){
            if(!set.contains(c)){

            }

        }
    }

}
