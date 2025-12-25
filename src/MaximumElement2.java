import java.util.HashMap;
import java.util.Map;

public class MaximumElement2 {
    public static void main(String args[]){
        int [] arr ={1,2,3,344,5,6,3,2,1,45,6,7,78,8,8,3,3,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0;
        int maxelement =arr[0];
        for(int key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                maxelement=key;
            }

        }
        System.out.println(max);
        System.out.println(maxelement);
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" ->"+entry.getValue());
        }


    }
}
