import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Nonrepeating_sub_sequen {
    public static void main(String[] args) {
        String a="bbbbbbbbb ";
        int i=0;
        int j=0;
        int count;
        int Max=0;
        List<Character> list=new ArrayList<>();
        while(j<a.length()){
            while(list.contains(a.charAt(j))){
                list.remove(0);
                i++;
            }
            list.add(a.charAt(j));

            Max=Math.max(Max,list.size());
            j++;
        }
        System.out.println(Max);

    }
}
