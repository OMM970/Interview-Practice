public class StringReverse1 {
    public static void main(String[] args) {
        String a = "Madam";
        a=a.toLowerCase();
        char[] ar =a.toCharArray();
        String reverse ="";
        for(int i=a.length()-1;i>=0;i--){
            reverse=reverse+ar[i];


        }
        System.out.println(reverse);
        if(a.equals(reverse)){
            System.out.println("the striong is pallindrome");
        }
        else{
            System.out.println("the striong is not pallindrome");
        }



    }
}
