public class HashMap {
    public static void main(String args[]){
        String t="egg";

        java.util.HashMap<Character,Integer> hm=new java.util.HashMap<>();

        for(char c:t.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        System.out.println(hm);


    }
}
