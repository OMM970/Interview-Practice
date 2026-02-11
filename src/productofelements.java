import java.util.Arrays;

public class productofelements {
    public static void main(String[] args) {
       int [] arr={1,2,3,4};
       int [] output=new int[arr.length];
       output[0]=1;
       int prod=1;
       int postprod=1;
       for(int i=0;i<=arr.length-2 ;i++){
           prod=prod*arr[i];
           output[i+1]=prod;

       }
       System.out.println(Arrays.toString(output));
       for(int i=arr.length-1;i>=1;i--){
           postprod=postprod*arr[i];
           output[i-1]=postprod*output[i-1];
       }
       System.out.println(Arrays.toString(output));


    }
}
