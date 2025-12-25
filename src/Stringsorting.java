import java.util.Arrays;

public class Stringsorting {
    public static void main(String[] args) {
        String str="Hello World New boy Om has arrived";
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                sb.append(ch);

            }
        }
        char[]  vowels=sb.toString().toCharArray();
        Arrays.sort(vowels);

        StringBuilder sb1=new StringBuilder();
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                sb1.append('_');
            }
            else{
                sb1.append(ch);
            }
        }
        int index=0;
        StringBuilder sb2=new StringBuilder();
        for(char ch:sb1.toString().toCharArray()){
            if(ch=='_'){
                sb2.append(vowels[index++]);

            }
            else{
                sb2.append(ch);
            }
        }
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());


    }
}
