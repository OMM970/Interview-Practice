public class TrappingRainWater {
    public static int TrappingWater(int [] height){
        int total=0;
       int MaxLeft=height[0];
       int MaxRight=height[height.length-1];
       int left=1;
       int right= height.length-1;
       while(left<right){
           if(height[left]<height[right]){
               if(height[left]>=MaxLeft){
                   MaxLeft=height[left];
               }
               else{
                   total += MaxLeft - height[left];
               }
               left++;
           }
           else{
               if(height[right]>=MaxRight){
                   MaxRight=height[right];
               }
               else{
                   total += MaxRight - height[right];
               }
               right--;
           }


       }

       return total;
    }
    public static void main(String[] args) {
       System.out.println(TrappingWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

    }
}
