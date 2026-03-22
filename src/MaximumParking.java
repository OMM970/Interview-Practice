import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int r=sc.nextInt();
        System.out.println("Enter the size of columns");
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    map.put(i,map.getOrDefault(i,0)+1);
                }
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getKey()+1;
            }


        }
        System.out.println("Maximum Parked row is "+max);

    }


}
