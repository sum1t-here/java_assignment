package otherpackage;

import mypackage.MyClass;

public class OtherClass {
    public void accessVariablesAndMethods() {
        MyClass myObject = new MyClass();

        // Accessing variables from MyClass in a different package
        // privateVariable is not accessible
        // defaultVariable and protectedVariable are not accessible in a different
        // package
        // publicVariable is accessible
        myObject.publicVariable = 10;

        // Accessing methods from MyClass in a different package
        // privateMethod() is not accessible
        // defaultMethod() and protectedMethod() are not accessible in a different
        // package
        // publicMethod() is accessible
        myObject.publicMethod();
    }
}
