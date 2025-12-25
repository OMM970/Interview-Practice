public class MaximumElement {
    public static void main(String args[]) {
        int vowels=0;
        int consonants=0;
        int space=0;
        String str = "Hello bhai om";
        str = str.toLowerCase();
        for(char c:str.toCharArray()){
            if("aeiou".indexOf(c)!=-1){
                vowels++;

            }
            else{
                if(c>='a' &&  c<='z'){
                    consonants++;
                }
                else{
                    space++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(space);
    }

}
