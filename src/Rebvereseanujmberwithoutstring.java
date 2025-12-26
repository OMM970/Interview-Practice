public class Rebvereseanujmberwithoutstring {
    public static void main(String[] args) {
        System.out.print(reversedigfits(78));

    }
    public static int reversedigfits(int a){
        int reverse=0;
        while(a!=0){
            int number=a%10;
            reverse = reverse*10+number;
            a=a/10;
        }
        return reverse;
//        if(a<=0){
//            return -1;
//
//        }

    }
}
