public class Sumrecurrsion {
    public static void main(String[] args) {
        int ans=sum(4);
        System.out.println(ans);

    }
    static int sum(int a){
        if(a==1){
            return 1;
        }
        return a+sum(a-1);

    }
}
