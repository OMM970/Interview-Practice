import java.util.HashMap;
import java.util.Scanner;

public class Substring {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("monday",6);
        map.put("tuesday",5);
        map.put("wednesday",4);
        map.put("thursday",3);
        map.put("friday",2);
        map.put("saturday",1);
        map.put("sunday",0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n = sc.nextInt();
        System.out.println("Enter start day");
        String start = sc.next();
        int ans=0;
        if(n-map.get(start)>1){
            ans=1+(n-map.get(start))/7;

        }
        System.out.println(ans);

    }
}
