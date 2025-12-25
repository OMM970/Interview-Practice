import java.util.ArrayList;
import java.util.List;

public class ListProgramming {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int j=0;j<=10;j++){
            List<Integer> newlist = new ArrayList<Integer>();
            newlist.add(j);
        }
        System.out.println(list);
    }
}
