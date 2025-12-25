import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1="start";
        String str2="tarst";
        StringBuilder sb1=new StringBuilder(str1);
        StringBuilder sb2=new StringBuilder(str2);



        char[] ar=sb1.toString().toCharArray();
        char[] ar1=sb2.toString().toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ar1);
        sb1.setLength(0);
        sb1.append(ar);

        sb2.setLength(0);
        sb2.append(ar1);

        if(sb1.toString().equals(sb2.toString())){
            System.out.println("Strings are the anagram");
            System.out.println(sb1);
            System.out.println(sb2);
        }
        else{
            System.out.println("Strings are not the anagram");
            System.out.println(sb1);
            System.out.println(sb2);
        }


    }
}
