public class SubArray {
    public static void main(String[] args) {
        String str ="abcabcbb";
        int i=0;
        int j=i+1;
        int size;
        int Max=0;
        while(j<=str.length()-1){
            if(str.charAt(i)!=str.charAt(j) && str.charAt(j)!=str.charAt(j+1)){
                size=j-i+1;
                if(size>Max){
                    Max=size;
                }
                j++;
            }
            else{
                i++;

            }
        }

        System.out.println("Maximum Subarray is : "+Max);
    }
}
