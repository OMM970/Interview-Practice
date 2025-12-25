public class AverageWindow {
    public static void main(String args[]){
        int [] arr={1,12,-5,-6,50,3};
        int k=4;
        double avg=0;
        double sum=0;
        float max=0;
        int j=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        avg=sum/k;
        double newavg=0;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[j];
            sum=sum+arr[i];

            newavg=sum/k;
            j++;
            avg=Math.max(avg,newavg);

        }


        System.out.println(avg);
    }
}
