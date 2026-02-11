public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int area=(right-left)*(Math.min(height[left],height[right]));
            max=Math.max(max,area);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;


    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,1}));
    }
}
