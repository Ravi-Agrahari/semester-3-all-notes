/*
    * Access Specifier
    *******************

     Access specifiers are the keywords in Java that define the access control for classes, methods, and variables.

     Types of Access Specifiers:
    ============================
        1. Public:
            The public access specifier allows a class, method, or variable to be accessed from any other class.

        2. Protected:
            The protected access specifier allows a class, method, or variable to be accessed within the same package or by a subclass of the class in a different package.

        3. Default:
            The default access specifier allows a class, method, or variable to be accessed only within the same package.
        
        4. Private:
            The private access specifier allows a class, method, or variable to be accessed only within the same class.


 */

// Example for Access Specifier
class Car {
    public String model; // public variable
    protected int year; // protected variable
    int price; // default variable
    private String color; // private variable
}

public class access_specifier {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "BMW"; // OK
        myCar.year = 2020; // OK
        myCar.price = 50000; // OK
        // myCar.color = "Red"; // Error: color has private access in Car
    }
}
