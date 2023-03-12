// Write a program that show working of different functions of String and StringBufferclasss like setCharAt(), setLength(), append(), insert(), concat()and equals().
public class strAndStrBuff {
    public static void main(String[] args) {
        // Demonstrate String functions
        String str = "Hello, world!";

        System.out.println("Original string: " + str);
       
        System.out.println("Length of the string: " + str.length());

        System.out.println("Character at index 4: " + str.charAt(4));

        System.out.println("Concatenated with ' Java': " + str.concat(" Java"));
        
        System.out.println("Equals to 'hello, world!': " + str.equals("hello, world!"));
        
        // Demonstrate StringBuffer functions
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("Original StringBuffer: " + sb);

        sb.setCharAt(1, 'i');
        System.out.println("After setCharAt(1, 'i'): " + sb);

        sb.setLength(3);
        System.out.println("After setLength(3): " + sb);

        sb.append("p!");
        System.out.println("After append(\"p!\"): " + sb);

        sb.insert(2, "l");
        System.out.println("After insert(2, \"l\"): " + sb);

    }

}
