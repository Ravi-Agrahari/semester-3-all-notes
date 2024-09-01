/*
  Constructors
 ***************
    Constructors are used to initialize the object.
    They have the same name as the class and do not have a return type.
 
    Types of Constructors:
    =======================

    1. Default Constructor:
    -----------------------
        A constructor that does not have any parameters is called a default constructor.
        If a class does not have any constructor, then the compiler automatically creates a default constructor.
        Example:
            class Car {
                Car() {
                    System.out.println("Car is created");
                }
            }

    2. Parameterized Constructor:
    -----------------------------
        A constructor that has parameters is called a parameterized constructor.
        Example:
            class Car {
                String color;
                int speed;
                
                Car(String c, int s) {
                    color = c;
                    speed = s;
                }
                
                void display() {
                    System.out.println("Color: " + color + ", Speed: " + speed);
                }
            }


    3. Copy Constructor:
    --------------------
        A constructor that copies the values of another object is called a copy constructor.
        Example:
            class Car {
                String color;
                int speed;
                
                Car(String c, int s) {
                    color = c;
                    speed = s;
                }
                
                Car(Car car) {
                    color = car.color;
                    speed = car.speed;
                }
                
                void display() {
                    System.out.println("Color: " + color + ", Speed: " + speed);
                }
            }

    4. Constructor Overloading:
    ---------------------------

        Constructor overloading is a concept in which a class can have more than one constructor.
        Example:
            class Car {
                String color;
                int speed;
                
                Car() {
                    color = "Red";
                    speed = 60;
                }
                
                Car(String c) {
                    color = c;
                    speed = 60;
                }
                
                Car(String c, int s) {
                    color = c;
                    speed = s;
                }
                
                void display() {
                    System.out.println("Color: " + color + ", Speed: " + speed);
                }
            }

    5. Constructor Chaining:
    ------------------------
            
            Constructor chaining is a concept in which a constructor calls another constructor of the same class.
            Example:
                class Car {
                    String color;
                    int speed;
                    
                    Car() {
                        this("Red", 60);
                    }
                    
                    Car(String c, int s) {
                        color = c;
                        speed = s;
                    }
                    
                    void display() {
                        System.out.println("Color: " + color + ", Speed: " + speed);
                    }
                }


    6. Super Keyword:
    -----------------
        The super keyword is used to call the constructor of the parent class.
        Example:
            class Vehicle {
                Vehicle() {
                    System.out.println("Vehicle is created");
                }
            }
            
            class Car extends Vehicle {
                Car() {
                    super();
                    System.out.println("Car is created");
                }
            }


    7. This Keyword:
    ----------------
        The this keyword is used to refer to the current object.
        Example:
            class Car {
                String color;
                int speed;
                
                Car(String color, int speed) {
                    this.color = color;
                    this.speed = speed;
                }
                
                void display() {
                    System.out.println("Color: " + color + ", Speed: " + speed);
                }
            }


    8. Static Block:
    ----------------
        A static block is used to initialize static variables.
        Example:
            class Car {
                static int count;
                
                static {
                    count = 0;
                }
            }


    9. Instance Block:
    -------------------
        An instance block is used to initialize instance variables.
        Example:
            class Car {
                int speed;
                
                {
                    speed = 60;
                }
            }


    10. Initialization Block:
    -------------------------
        An initialization block is used to initialize instance variables.
        Example:
            class Car {
                int speed;
                
                Car() {
                    System.out.println("Constructor is called");
                }
                
                {
                    speed = 60;
                }
            }

    11. Nested Class:
    -----------------
        A class defined within another class is called a nested class.
        Example:
            class Outer {
                class Inner {
                    void display() {
                        System.out.println("Inner class");
                    }
                }
            }

    
  
 */