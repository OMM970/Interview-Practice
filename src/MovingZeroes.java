public class MovingZeroes {
    public static void main(String args[]){
        int arr[]={0,1,0,3,12};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr=new int[arr.length+1];
                arr[arr.length+1]=arr[i] ;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
