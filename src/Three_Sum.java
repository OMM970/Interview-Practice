import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        int k = 2;
        int target = 0;
        if (nums.length == 3 && nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> list2 = new ArrayList<>();
            list2.add(nums[i]);
            list2.add(nums[j]);
            list2.add(nums[k]);
            list.add(list2);


        }

        for (int mid = 1; mid <= nums.length; mid++) {
            int left = mid - 1;
            int right = mid + 1;
            while (left >= 0 && right < nums.length) {
                int sum = nums[left] + nums[right] + nums[mid];
                if (sum == target) {
                    List<Integer> list3 = new ArrayList<>();
                    list3.add(nums[i]);
                    list3.add(nums[j]);
                    list3.add(nums[k]);
                    list.add(list3);
                    left--;
                    right++;


                } else if (sum > target) {
                    right++;
                } else {
                    left--;
                }


            }

        }
        System.out.println(list);

    }
}

