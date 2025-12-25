public class printingwithrecurrsion {
    public static void main(String args[]){
        printnums(20,0);


    }
    public static int printnums(int n, int i){
        if(i>n){
            return -1 ;
        }
        System.out.print(i+" ");
       return printnums(n,i+1);


    }
}
