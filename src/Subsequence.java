public class Subsequence {
    public static void main(String args[]){
        String s="asdf";
        String a="asd";
        StringBuilder sb=new StringBuilder(s);
        if(sb.subSequence(0, s.length()-1).toString().equals(a)){
            System.out.println("a is the sub tring of a");
        }
        a.equals(s  );
    }
}
