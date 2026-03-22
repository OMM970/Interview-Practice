import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Maxmimumtriangle {
    public static int maxPerimeterTriangle(ArrayList<Integer> arr, int n) {
        Collections.sort(arr);
        int maxPerimeter=0;
        int left=0;
        int right=2;
        int val=0;
        while(right<n-1){
            int a=arr.get(left);
            int b=arr.get(left+1);
            int c=arr.get(right);
            if(a+b>c){
                int perimeter=a+b+c;
                val=perimeter;

            }
            maxPerimeter=Math.max(val,maxPerimeter);
            left++;
            right++;
        }



        return maxPerimeter;




    }
}
