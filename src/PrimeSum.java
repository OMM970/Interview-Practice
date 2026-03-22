import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int sum=0;
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                sum+=i;
            }


        }
        System.out.println("The sum is "+sum);

    }
}
