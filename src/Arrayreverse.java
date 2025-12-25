import java.util.Scanner;

public class Arrayreverse {
    public static int max(int[]  arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }return max;


    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int[] arr = {1, 23, 4, 45, 6, 7, 7, 8, 9,};
        int i = arr.length - 1;
        int j = 0;
        int change = 0;
        while (j < i) {
            change = arr[j];
            arr[j] = arr[i];
            arr[i] = change;
            i--;
            j++;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");



        }






















































    }
}