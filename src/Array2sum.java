import java.util.ArrayList;
import java.util.List;

public class Array2sum {
    public static void main(String[] args) {
        int  arr[]={2,7,11,15};
        int target =9;
        int sum=0;
        List<Integer> sum1 =new ArrayList<>();
        int i=0;
        int j=i+1;
        while(i<=j) {
            sum=arr[i]+arr[j];
            if(sum==target) {
                sum1.add(arr[i]);
                sum1.add(arr[j]);
            }
            else if(sum>target) {
                j--;
            }
            else{
                i++;
            }


        }
        System.out.println(sum1);
    }
}
