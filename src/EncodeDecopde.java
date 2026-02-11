import java.util.ArrayList;
import java.util.List;

public class EncodeDecopde {
   public static void main(String[] args) {
//       List<String> list = new ArrayList<String>();
//       String str = "";
//       StringBuilder stringBuilder = new StringBuilder();
//       //["lint","code","love","you"]
//       list.add("lint");
//       list.add("code");
//       list.add("love");
//       list.add("you");
//       System.out.println(list);
//       for(String ch : list){
//         stringBuilder.append(ch.length()).append("#").append(ch);
//       }
//
//       System.out.println(stringBuilder.toString());



   }
    public String encode(List<String> list) {
        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
      while(i<str.length()){
          int j=i;
          while(str.charAt(j) != '#'){
              j++;
          }
          int len= Integer.parseInt(str.substring(i,j));
          j++;
          String temp=str.substring(i,j+len);
          result.add(temp);
      }
      return result;

    }


}
