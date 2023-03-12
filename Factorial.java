public class Factorial {
    public static void main(String[] args) {
        int num = 5; // The number to find the factorial of
        int factorial = findFactorial(num);
        System.out.println(num + "! = " + factorial);
    }
    
    public static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
}
