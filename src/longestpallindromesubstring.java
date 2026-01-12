public class longestpallindromesubstring {
             public static void main(String args[]){
                 String s ="babad";
                 String pal="";
                 int max=0;
                 StringBuilder sc =new StringBuilder(pal);
                 int i=0;
                 int j=s.length()-1;
                 while(i<j){
                     if(s.charAt(i)==s.charAt(j)){
                         for(int k=i+1;k<j;k++){
                             sc.append(sc.charAt(k));
                         }
                     }
                     if(sc.reverse().equals(sc.toString())){
                         System.out.println(sc.length());
                     }
                     if(sc.length()>max){
                         max=sc.length();
                     }

                     i++;
                     j--;

                 }
                 System.out.println(max);
             }
}
