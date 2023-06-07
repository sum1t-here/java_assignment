package mypackage;

import otherpackage.OtherClass;

public class MainProgram {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Accessing variables and methods of MyClass
        myObject.defaultVariable = 10;
        myObject.protectedVariable = 20;
        myObject.publicVariable = 30;

        myObject.defaultMethod();
        myObject.protectedMethod();
        myObject.publicMethod();

        // Creating an instance of MySubclass
        SubClass mySubObject = new SubClass();

        // Accessing variables and methods of MySubclass
        mySubObject.defaultVariable = 40;
        mySubObject.protectedVariable = 50;
        mySubObject.publicVariable = 60;

        mySubObject.defaultMethod();
        mySubObject.protectedMethod();
        mySubObject.publicMethod();

        // Creating an instance of OtherClass from the otherpackage
        OtherClass otherObject = new OtherClass();

        // Accessing variables and methods of OtherClass
        myObject.publicVariable = 70;
        myObject.publicMethod();
    }
}
