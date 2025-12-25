public class isPrrimeusingrecurrsion {
    public static void main(String[] args) {
        int n=9;
        System.out.println(isPrime(n,2));

    }
    public static boolean isPrime(int n,int m){
       if(n<=1){
           return false;
       }
//       int count=0;
//       for(int i=1;i<10;i++){
//           if(n%i==0){
//               count++;
//           }
//       }
//       if(count==2){
//           return n;
//       }
        if(m * m>n){return true;}
        if (n%m==0){return false;}
       return isPrime(n,m+1);
    }
}
