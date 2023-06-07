// Write a program to show that during function overloading, if no matching argument is found, then java will apply automatic type conversions(from lower to higher data type)

public class eleven {
    public void display(int num) {
        System.out.println("Displaying int: " + num);
    }

    public void display(double num) {
        System.out.println("Displaying double: " + num);
    }

    public static void main(String[] args) {
        eleven demo = new eleven();

        // Calling the display() method with an int argument
        demo.display(10);

        // Calling the display() method with a float argument
        demo.display(3.14f);

        // Calling the display() method with a byte argument
        demo.display((byte) 5);

        // Calling the display() method with a char argument
        demo.display('A');
    }

}
