import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]={1,22,2,2,4,5,6,78,8,8,8};
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
