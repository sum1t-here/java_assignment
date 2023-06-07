// Write a program to show the use of nested try statements that emphasizes the sequence of checking for catch handler statements.
public class nineteen {

    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = { 1, 2, 3 };

            try {
                // Inner try block
                int result = numbers[4]; // Accessing an element beyond the array size
                System.out.println("Result: " + result);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Inner catch block
                System.out.println("Inner catch block: ArrayIndexOutOfBoundsException");
                throw new ArithmeticException("ArithmeticException from inner catch block");
            } finally {
                // Inner finally block
                System.out.println("Inner finally block");
            }
        } catch (ArithmeticException e) {
            // Outer catch block
            System.out.println("Outer catch block: ArithmeticException");
        } finally {
            // Outer finally block
            System.out.println("Outer finally block");
        }
    }

}
