/*
 Data Types, Variables, Operators, Keywords:
 ********************************************

    Data Types:
    ============
        Data types specify the different sizes and values that can be stored in the variable. 
        There are two types of data types in Java:
            1. Primitive data types
                example:
                    byte, short, int, long, float, double, char, boolean
            2. Non-primitive data types
                example:
                    String, Array, Class




    Variables:
    ===========
        Variables are containers for storing data values. In Java, there are different types of variables:

            1. Local variables
            -------------------

                defination:
                    Local variables are declared inside a method, constructor, or block. They are only accessible within the scope in which they are declared.
                example:
                    public class Main {
                        public static void main(String[] args) {
                            int x = 5; // local variable
                            System.out.println(x);
                        }
                    }


            2. Instance variables
            ----------------------

                defination:
                    Instance variables are declared in a class, but outside a method, constructor, or block. 
                    They are created when an object of the class is instantiated and destroyed.

                example:
                    public class Car {
                        String color; // instance variable
                        int speed; // instance variable
                        
                        void drive() {
                            System.out.println("Driving at speed: " + speed);
                        }
                    }

            3. Static variables
            --------------------

                defination:
                    Static variables are declared with the static keyword in a class, but outside a method, constructor, or block. 
                    They are created when the program starts and destroyed when the program stops.

                example:
                    public class Car {
                        static int count = 0; // static variable
                        
                        Car() {
                            count++;
                        }
                        
                        public static void main(String[] args) {
                            Car car1 = new Car();
                            Car car2 = new Car();
                            System.out.println(Car.count); // Output: 2
                        }
                    }

    Operators:
    ===========

        Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result. 

        There are different types of operators in Java:
            1. Arithmetic operators
                example:
                    +, -, *, /, %, ++, --

            2. Relational operators
                example:
                    ==, !=, >, <, >=, <=

            3. Logical operators
                example:
                    &&, ||, !

            4. Bitwise operators
                example:
                    &, |, ^, ~, <<, >>

            5. Assignment operators
                example:
                    =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>= 

            6. Conditional operators
                example:
                    ?:



    Keywords:
    ==========
        Keywords are reserved words in Java that have special meanings and cannot be used as identifiers (variable names, function names, etc.). 
        Some of the keywords in Java include:
            1. abstract
            2. class
            3. extends
*/

// Example Program for datatypes

public class some_basics_of_java {
    public static void main(String[] args) {
        // Primitive data types
        byte myByte = 100;
        short myShort = 5000;
        int myInt = 100000;
        long myLong = 15000000000L;
        float myFloat = 5.75f;
        double myDouble = 19.99;
        char myChar = 'A';
        boolean myBoolean = true;

        // Non-primitive data types
        String myString = "Hello, World!";
        int[] myArray = {1, 2, 3, 4, 5};
        Car myCar = new Car();

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
        System.out.println("String: " + myString);
        System.out.println("Array: " + java.util.Arrays.toString(myArray));
        System.out.println("Car: " + myCar);
    }
}


