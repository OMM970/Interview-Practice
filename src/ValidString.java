import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidString {
     public static void main(String[] args) {
//         System.out.println(isValid("###*****"));
//         Scanner sc = new Scanner(System.in);
//
//         System.out.println("Enter string for balloon test:");
//         String input = sc.nextLine();
//
//         System.out.println(Baloon(input.toCharArray()));
//
//         sc.close();

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter size:");
         int n = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }

         bubbleSort(arr);

         System.out.println("Sorted array:");
         for (int x : arr) {
             System.out.print(x + " ");
         }

         sc.close();



     }
     public static int isValid(String s){
         int count = 0;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='#'){
                 count++;
             }
             else{
                 count--;
             }
         }
         return count;

     }
     public static String Baloon(char[] elements){
         HashMap<Character,Integer>map=new HashMap<>();
         StringBuilder sb =new StringBuilder();
         for(int i=0;i<elements.length;i++){
             map.put(elements[i],map.getOrDefault(elements[i],0)+1);
         }
         for(Map.Entry<Character,Integer> entry:map.entrySet()){
             int value=entry.getValue()%2;
             if(value!=0){
                sb.append(entry.getKey());
                 return String.valueOf(entry.getKey());

             }
         }
         return "AL values are in even";

     }
    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {


            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
