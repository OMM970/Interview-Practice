import java.util.Arrays;

public class Digits1 {
    public static int[] plusOne(int[] digits) {
      for(int i=digits.length-1;i>=0;i--){
          if(digits[i]==9){
              digits=new int[digits.length+2];
              digits[i]=1;
              digits[i+1]=0;
          }
      }


        return digits;
    }
    public static void main(String[] args) {
          System.out.println(Arrays.toString(plusOne(new int[]{1,2,34,5,6,78})));   ;

    }
}
