// Write a program to demonstrate the concept of boxing and unboxing.
public class boxAndUnbox {
    public static void main(String[] args) {
        Integer iOb = new Integer(100); // boxing
        int i = iOb.intValue(); // unboxing
        System.out.println(i + " " + iOb);
    }
}
