public class Recurrsion {
    public static void main(String[] args) {
        Sayhi(100000000000000000.0);


    }

    public static void Sayhi(Double count) {
        System.out.println("Hello World");
        if (count == 200) {
            return;
        }
        Sayhi(count - 1);
    }
}