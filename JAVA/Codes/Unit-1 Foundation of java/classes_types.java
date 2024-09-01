/*
 * Classes & Its Types in Java
    ----------------------------

        A class is a blueprint for creating objects in Java. Types of classes include:

        Concrete class:
             A class that can be instantiated.
                Example: class Car { ... }
                
        Abstract class:
             A class that cannot be instantiated and may contain abstract methods.
                Example: abstract class Shape { ... }


        Interface: 
             A reference type in Java that can contain only constants, method signatures, default methods, static methods, and nested types.
                Example: interface Drawable { ... }
 */

 // Example for Concrete class, Abstract class, Interface
 
    // Concrete class
    class Car {
        String color;
        int speed;
        
        void drive() {
            System.out.println("Driving at speed: " + speed);
        }
    }

    // Abstract class
    abstract class Shape {
        abstract void draw();
    }

    // Interface
    interface Drawable {
        void draw();
    }

    public class classes_types {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.color = "Red";
            myCar.speed = 60;
            myCar.drive();

            // Shape myShape = new Shape(); // Error: Cannot instantiate the type Shape

            // Shape myShape = new Shape() {
            //     @Override
            //     void draw() {
            //         System.out.println("Drawing a shape");
            //     }
            // };
        }
    }
