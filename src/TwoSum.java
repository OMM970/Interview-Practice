import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr={3,3};
        int target=6;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(target-arr[i])) {
                System.out.println(map.get(target-arr[i]));
                System.out.println(i);
                break;
            }
        }

    }
}
