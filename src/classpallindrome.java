public class classpallindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(123));
//        int n=121;
//        String str=String.valueOf(n);
//        StringBuilder sb=new StringBuilder(str);
//        System.out.println(sb);
//        if(sb.reverse().toString().equals(str)){
//            System.out.println(true);
//
//        }
//        else{
//            System.out.println(false);
//        }
    }
    public static boolean checkPalindrome(int x) {
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
       return str.equals(sb.reverse().toString());
    }
}
