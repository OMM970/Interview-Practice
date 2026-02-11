import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class topKfrequentElements {
    public static void main(String[] args) {
        int [] arr ={1,1,1,2,2,3,3,4,4,5,7,8,8,8};
        int k=2;

        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        int index=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=k){
                count++;
            }
        }
        int [] result = new int[count];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=k){
                 result[index++]=entry.getKey();
            }
        }
        System.out.println(Arrays.toString(result));


    }
}
