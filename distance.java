// Write a program to create a ―distance‖ class with methods where distance is computed in terms of feet and inches, how to create objects of a class and to see the use of this pointer

// Modify the ―distance‖ class by creating constructor for assigning values (feet and inches)to the distance object. Create another object and assign second object as reference variable to another object reference variable. Further create a third object which is a clone of the first object.

public class distance {
    private int feet;
    private int inches;

    // constructor to set initial value
    public distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public int getFeet() {
        return this.feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return this.inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public void display() {
        System.out.println("Distance: " + this.feet + " feet, " + this.inches + " inches");
    }

    public void add(distance d) {
        this.feet += d.feet;
        this.inches += d.inches;
        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches %= 12;
        }
    }

    // Method to create a clone of the Distance object
    public distance clone() {
        distance clone = new distance(this.feet, this.inches);
        return clone;
    }

    // Method to assign one object reference variable to another
    public void assign(distance d) {
        this.feet = d.getFeet();
        this.inches = d.getInches();
    }

    public static void main(String[] args) {
        distance d1 = new distance(5, 8);
        distance d2 = new distance(3, 6);
        System.out.print("d1: ");
        d1.display();
        System.out.print("d2: ");
        d2.display();
        d1.add(d2);
        System.out.print("d1 after adding d2: ");
        d1.display();

        distance d3 = new distance(5, 11);
        distance d4 = new distance(0, 0);
        System.out.print("d3: ");
        d3.display();
        System.out.print("d4: ");
        d4.display();

        // assign 
        d4.assign(d3);
        System.out.print("d4 after assigning d3: ");
        d4.display();

        // clone
        distance d5 = d3.clone();
        System.out.print("d5 is cloned from d3: ");
        d5.display();

    }
}
