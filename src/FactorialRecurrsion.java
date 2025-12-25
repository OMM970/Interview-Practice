public class FactorialRecurrsion {
    public static void main(String[] args) {
        System.out.println(factorial(7));

    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        System.out.println("Factorial of " + n + " is " + factorial(n-1));
        return n * factorial(n - 1);


    }
}
