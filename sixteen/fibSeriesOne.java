// Write a program to create a multilevel package and also creates a reusable class to generate Fibonacci series, where the function to generate fibonacii series is given in a different file belonging to the same package.
package sixteen;

public class fibSeriesOne {
    public static void main(String[] args) {
        int n = 10;
        Fibonacci fibonacci = new Fibonacci();
        int[] series = fibonacci.generateSeries(n);

        System.out.println("Fibonacci series of " + n + " numbers:");
        for (int num : series) {
            System.out.print(num + " ");
        }
    }
}
