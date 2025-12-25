public class Arraysecondhighest {
    public static void main(String args[]){
        int [] arr={1};
       int largest=Integer.MIN_VALUE;
       int secondLargest=Integer.MIN_VALUE;
       for(int num:arr){
           if(num>largest){
               secondLargest=largest;
               largest=num;
           }
           else if(num > secondLargest && num!=largest) {
               secondLargest=num;

           }
       }
       if(secondLargest==Integer.MIN_VALUE){
           System.out.println("The second largest number did not exist in the array");
       }
       else{
           System.out.println(secondLargest);

       }


    }
}
