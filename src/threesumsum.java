import java.util.*;

public class threesumsum {
    public List<List<Integer>> threeSum(int[] ar) {
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                for (int k = i+2; k < ar.length; k++) {
                    sum = ar[i] + ar[j] + ar[k];
                    if (sum == 0) {
                        list.add(ar[i]);
                        list.add(ar[j]);
                        list.add(ar[k]);
                    }
                    list.sort(Collections.reverseOrder());


                }
            }

        }
        list.sort(Collections.reverseOrder());
        return Collections.singletonList(list);
    }

    public static void main(String[] args) {
        int ar[]={-1,0,1,2,-1,4};
        int sum=0;
        Set<List<Integer>> set=new HashSet<>();


        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                for(int k=j+1;k<ar.length;k++){
                    sum =ar[i]+ar[j]+ar[k];
                    if(sum==0){
                        List<Integer> list=new ArrayList<>();

                        list.add(ar[i]);
                        list.add(ar[j]);
                        list.add(ar[k]);
                        System.out.println(list);
                        Collections.sort(list);
                        set.add (list);




                    }
                    else{

                    }


                }
            }
        }


        System.out.println(set);





    }
}
