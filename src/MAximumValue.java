import java.util.*;

public class MAximumValue {
    public static void main(String args[]) {

    }
    public static int[] maxSlidingWindow(int[] nums, int k){
        int l=0;
        int r=k-1;
        int val=0;
        Deque<Integer> dq = new LinkedList<>();
        int []res=new int[nums.length-k+1];
       for(int i=0;i< nums.length;i++){
           if(!dq.isEmpty() && nums[dq.peekLast()]<i-k){
               dq.pollFirst();
           }
           while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
               dq.pollLast();
           }
           dq.offerLast(i);
           if (i >= k - 1) {
               res[i - k + 1] = nums[dq.peekFirst()];
           }

       }
        return  res;
    }
}
