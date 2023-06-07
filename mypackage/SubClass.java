package mypackage;

public class SubClass extends MyClass {
    public void accessVariablesAndMethods() {
        // Accessing variables from the superclass
        // privateVariable is not accessible in the subclass
        // defaultVariable, protectedVariable, and publicVariable are accessible
        defaultVariable = 10;
        protectedVariable = 20;
        publicVariable = 30;

        // Accessing methods from the superclass
        // privateMethod() is not accessible in the subclass
        // defaultMethod(), protectedMethod(), and publicMethod() are accessible
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
