public class Stringpractice {
    public static void main(String[] args) {
        String str1 = "abc";
       StringBuilder  str2 = new StringBuilder(str1);
//        System.out.println(str2.reverse());
        int i=0;
        int j=str2.length()-1;
        while (i<=j){
            char ch=str2.charAt(i);
           str2.setCharAt(i,str2.charAt(j));
           str2.setCharAt(j,ch);
           i++;
           j--;
        }
        System.out.println(str1);
        System.out.println(str2);

    }
}
