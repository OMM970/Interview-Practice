public class StringVowelConsonants {
    public static void main(String[] args) {
        String str = "Hello World New boy Om has arrived";
        int vowels=0, consonants=0,spaces=0;
       str=str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }
                else{
                    consonants++;
                }


            }
            if(ch==' '){
                spaces++;
            }
        }
        int sum = vowels+consonants+spaces;
        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);
        System.out.println("spaces: "+spaces);
        System.out.println("length: "+str.length());
        System.out.println("sum: "+sum);
    }
}
