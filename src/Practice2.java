public class Practice2 {
    public static void main(String args[]){
        int [] ar={1,2,2,3,4};
        int max =Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        for (int i=0;i<ar.length;i++){
            if(ar[i]>max){
                second=max;
                max=ar[i];
            }
            else if(ar[i]>second && ar[i]!=max){
                second=ar[i];
            }
        }
        System.out.println(max);
        System.out.println(second);

    }
}
