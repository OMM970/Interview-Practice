import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int value=2;
        Arrays.sort(arr);
        int i=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==value){
                i++;
            }
            System.out.print(arr[i]+",");
        }

    }

}
