import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class crypiucnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int l=sc.nextInt();
        System.out.print("Enter a second number: ");
        int s=sc.nextInt();
        for(int i=l;i<=s;i++){
            int num =i;
            if(num%7!=0){
                continue;
            }
            if(num%5==0){
                continue;
            }
           String str=String.valueOf(num);
            String rev = new StringBuilder(str).reverse().toString();
            if(str.equals(rev)){
                continue;
            }
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=0;j<=str.length()-1;j++){
                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
            }
            boolean duplicate=false;

            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()>1){
                    duplicate=true;
                    break;
                }
            }
            if(duplicate){
                continue;
            }
            System.out.println(num);

        }

    }
}
