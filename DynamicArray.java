import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter the size of array
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // definig array
        int[] arr = new int[size];  
        
        System.out.println("Enter the values for the array:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The values in the array are:");

        for (int i = 0; i < size ; i++) {
            System.out.println(arr[i]);
        }
        scanner.close();
    }
}
