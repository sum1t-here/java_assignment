// Write a program to show the use of static functions and to pass variable length arguments in a function.
public class varLenArg {

        public static int sum(int... numbers) {
            int result = 0;
            for (int n : numbers) {
                result += n;
            }
            return result;
        }
    
        
        public static void main(String[] args) {
            
            System.out.println("Sum is: " + sum(1, 2));
            System.out.println("Sum is: " + sum(1, 2, 3));
            System.out.println("Sum is:" + sum(1, 2, 3, 4, 5));
        }
    
}
