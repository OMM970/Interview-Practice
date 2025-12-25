public class Evenandodd {
    public static void main(String[] args) {
        int [] arr={1,3,4,56,6,7,7,88,9};
        int counteven=0;
        int countodd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println(counteven+" "+countodd);
    }
}
