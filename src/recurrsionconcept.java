public class recurrsionconcept {
    public static void main(String[] args) {
        printanything(5);
    }
    public static void printanything(int a) {
        if(a==0){
            return ;
        }
        System.out.print(a);
        printanything(--a);
    }
}
