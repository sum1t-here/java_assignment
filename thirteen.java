// Write a program to show the use of static functions and to pass variable length arguments in a function.

public class thirteen {
    public static void staticFunction() {
        System.out.println("This is a static function.");
    }

    public static void variableArguments(int... numbers) {
        System.out.println("Variable Arguments:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        staticFunction();

        variableArguments(1, 2, 3);
        variableArguments(4, 5, 6, 7, 8);
        variableArguments(9);
    }

}
