public class classsubstringpallindrome {
    public static void main(String[] args){
       String str="bbababc";
       String str1="";
       StringBuilder sb =new StringBuilder(str);
        StringBuilder sb1 =new StringBuilder();
       for(int i=0;i<sb.length();i++){
           for(int j=i+1;j<sb.length();j++){
                   sb1.append(sb.replace(i,j,sb.toString()));
                   System.out.println(sb1.reverse().toString().equals(sb.substring(i,j)));
           }

       }


    }
}
