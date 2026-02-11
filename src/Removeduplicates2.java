public class Removeduplicates2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{2, 2, 23, 5, 6, 7, 7, 7, 7}));

    }
    public static int removeDuplicates(int[] nums) {
        int k=0;
        int count = 0;
        int i=0;

        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                nums[i]=nums[i+1];
                nums[i+1]=nums[i];
                i++;
            }

        }
        return nums[i+1];


    }
}
