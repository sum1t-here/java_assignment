// Create a multi­file program where in one file a string message is taken as input from the user and the function to display the message on the screen is given in another file (make use of Scanner package in this program)

import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        scanner.close();

        DisplayMessage.display(message);
    }
}
