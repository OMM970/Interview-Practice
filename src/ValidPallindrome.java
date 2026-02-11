public class ValidPallindrome {
    public static boolean validPallindrome(String s){
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if("abcdefghijklmnopqrstuvwxyz1234567890".indexOf(c)!=-1){
                sb.append(c);

            }
        }
        System.out.println(sb.toString());
        return sb.toString().equals(sb.reverse().toString());

    }
    public static void main(String[] args) {
        System.out.print(validPallindrome("0P"));


    }

}
