// write a program to show the difference between public and private access specifiers. The program should also show that primitive data types are passed by value and objects are passed by reference and to learn use of final keyword

public class twelve {

    private int privateVariable = 10;
    public int publicVariable = 20;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    public void modifyVariables(int primitiveValue, MyClass object) {
        primitiveValue += 5;
        object.value += 5;
    }

    public void modifyFinalVariable(final int finalValue) {
        // Uncommenting the line below will result in a compilation error
        // finalValue += 5;
        System.out.println("Final value: " + finalValue);
    }

    public static void main(String[] args) {
        twelve demo = new twelve();

        // Accessing public variable and method
        System.out.println("Public variable: " + demo.publicVariable);
        demo.publicMethod();

        // Accessing private variable and method (Compile-time error)
        // System.out.println("Private variable: " + demo.privateVariable);
        // demo.privateMethod();

        // Passing primitive data type by value
        int primitiveValue = 10;
        System.out.println("Before modification - Primitive value: " + primitiveValue);
        demo.modifyVariables(primitiveValue, null);
        System.out.println("After modification - Primitive value: " + primitiveValue);

        // Passing object by reference
        twelve.MyClass object = demo.new MyClass(20);
        System.out.println("Before modification - Object value: " + object.value);
        demo.modifyVariables(0, object);
        System.out.println("After modification - Object value: " + object.value);

        // Using the final keyword
        final int finalValue = 5;
        demo.modifyFinalVariable(finalValue);
    }

    class MyClass {
        public int value;

        public MyClass(int value) {
            this.value = value;
        }
    }
}
