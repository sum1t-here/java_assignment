package mypackage;

public class MyClass {
    private int privateVariable;
    int defaultVariable;
    protected int protectedVariable;
    public int publicVariable;

    private void privateMethod() {
        System.out.println("Private method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }
}
