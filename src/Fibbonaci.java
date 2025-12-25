public class Fibbonaci {
    public static void main(String args[]){
        int n=10, a=0,b=1;
        for(int i=0;i<n;i++){

            int c = a+b;
            a = b;
            b = c;
            System.out.print(a+" ");
        }    }
}
