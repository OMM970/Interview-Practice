import java.util.HashMap;
import java.util.Map;

public class FindingDupliocate {
    public static void main(String args[]){

    }
     public int findDuplicate(int[] nums){
         HashMap<Integer,Integer> map=new HashMap<>();
         for (int num : nums) {
             map.put(num, map.getOrDefault(num, 0) + 1);

         }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return -1;
     }
}
