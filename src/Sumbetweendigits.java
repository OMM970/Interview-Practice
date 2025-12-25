public class Sumbetweendigits {
    public static void main(String args[]){
        System.out.print(sumdigits(45787989));

    }
    public static int sumdigits(int a){
        if(a%10==a){
            return a;
        }
        return a%10+sumdigits(a/10);
    }
}
