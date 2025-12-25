import java.util.HashMap;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
       HashSet hs = new HashSet();
       int arr[] ={1,33,4,3,4,5,6,78,34,5,6,7,77,7,7};
       hs.hashCode();

    }
//}

    public int hashcode(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.hashCode();


    }
}
