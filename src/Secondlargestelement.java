public class Secondlargestelement {
    public static void main(String[] args) {
        int [] arr={23,56,778,22,99,45};
        int maxc=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxc){
                maxc=arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxc) {
                arr[i] = Integer.MIN_VALUE;
                break;
            }
        }
        int secondmax= arr[0];
        for (int num : arr) {
            if (num > secondmax) {
                secondmax = num;
            }
        }
               System.out.println("the max number is "+secondmax);



    }


}
