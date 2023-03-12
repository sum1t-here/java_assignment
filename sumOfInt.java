// To find the sum of any number of integers interactively, i.e., entering every number from the keyboard, whereas the total number of integers is given as a command line argument

import java.util.Scanner;

public class sumOfInt {

    public static void main(String[] args) {
        // Get the total number of integers from the command line argument
        int totalNumbers = Integer.parseInt(args[0]);

        int totalSum = 0;

        // Enter each integer and add it to the sum
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Enter integer #" + i + ": ");
            int number = scanner.nextInt();
            totalSum += number;
        }

        // Print the total sum
        System.out.println("The sum of the integers is: " + totalSum);
        scanner.close();
    }
}
