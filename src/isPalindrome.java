public class isPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.subSequence(0, s.length()-1).toString();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
       String st= sb.reverse().toString();
        System.out.println(sb);
        if(sb.toString().equals(st)){
            System.out.println("Yes");
        }

    }
}
