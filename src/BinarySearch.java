public class BinarySearch {
    public  static int search(int []ar,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(target==ar[m]){
            return m;
        }
        if(target<ar[m]){
            return search(ar,s,m-1,target);
        }
        return search(ar,m+1,e,target);


    }
    public static void main(String[] args) {
        int []ar={1, 5, 6, 8, 34, 77, 99};
        int target=34;

        System.out.println(search(ar,0,ar.length-1,target));

    }
}
