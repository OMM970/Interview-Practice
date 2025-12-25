public class StringIBM {
    public static void main(String[] args) {
        String str ="OmNarayanmishra";
        str=str.toLowerCase();
        int countVowels =0;
        int count1Consonats =0;
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                countVowels++;
            }
            else {
                count1Consonats++;
            }
        }
        int totalconversion = countVowels-count1Consonats;
        int minimum = count1Consonats - countVowels;
         System.out.println("Total number of vowels "+ " :"+countVowels);
        System.out.println("Total number of consonants"+ " :"+count1Consonats);
        System.out.println(totalconversion);
        if(totalconversion==0){
           System.out.println("total operations is zero");


        }else{
            System.out.println(""+totalconversion);
            //we will add the vowels
        }


    }
}
