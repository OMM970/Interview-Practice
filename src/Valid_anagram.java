import java.util.Arrays;

public class Valid_anagram {
    public static void main(String[] args) {
        String s="abc";
        String s1="cba";
        char[] arr1=s.toCharArray();
        char[] arr2=s1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Yes");
        }
    }
}
