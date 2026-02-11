import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSequence {
    public static void main(String[] args) {
       System.out.print (ConsecutiveSequence(new int[]{1,0,1,2}));

        //100,4,200,1,3,2
    }
    public static int ConsecutiveSequence(int [] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max=0;
        for(int num:set){
            if(!set.contains(num - 1)){

                int current = num;
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
