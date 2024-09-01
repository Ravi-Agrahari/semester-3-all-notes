/*

    Methods in java
    ***************

        A method is a block of code that performs a specific task. It is used to achieve code reusability and modularity in programming. In Java, methods are defined within a class and can be called to perform a specific action.

        Syntax:
            access_modifier return_type method_name(parameter_list) {
                // method body
            }

        Example:
            public class Calculator {
                public static int add(int a, int b) {
                    return a + b;
                }

                public static void main(String[] args) {
                    int sum = add(5, 3);
                    System.out.println("Sum: " + sum);
                }
            }

        Explanation:
            - The access_modifier specifies the visibility of the method (public, private, protected, default).

            - The return_type specifies the data type of the value returned by the method.
                - If a method does not return a value, the return type is void.
                - If a method returns a value, the return type is the data type of the value.

            - The method_name is the name of the method.

            - The parameter_list specifies the input parameters required by the method.
            
            - The method body contains the code that performs the specific task of the method.




            

        Types of Methods:
        =================

            1. Static Methods:
            -------------------
                Methods that belong to the class rather than an instance of the class. They can be called using the class name.
                Example:
                    public class MathUtils {
                        public static int add(int a, int b) {
                            return a + b;
                        }
                    }
            
            2. Instance Methods:
            ---------------------
                 Methods that belong to an instance of the class and can access instance variables.
                Example:
                    public class Car {
                        int speed;
                        
                        void drive() {
                            System.out.println("Driving at speed: " + speed);
                        }
                    }


            3. Getter and Setter Methods:
            ------------------------------
                 Methods used to get and set the values of instance variables.
                Example:
                    public class Car {
                        private String color;
                        
                        public String getColor() {
                            return color;
                        }
                        
                        public void setColor(String c) {
                            color = c;
                        }
                    }


            4. Constructor Methods:
            ------------------------
                 Special methods used to initialize objects of a class.
                Example:
                    public class Car {
                        String color;
                        int speed;
                        
                        Car(String c, int s) {
                            color = c;
                            speed = s;
                        }
                    }


            5. Method Overloading:
                 Defining multiple methods with the same name but different parameter lists.
                Example:
                    public class MathUtils {
                        public static int add(int a, int b) {
                            return a + b;
                        }

                        public static double add(double a, double b) {
                            return a + b;
                        }
                    }


            6. Method Overriding:
                 Redefining a method in a subclass with the same signature as a method in the superclass.
                Example:
                    class Animal {
                        void sound() {
                            System.out.println("Animal makes a sound");
                        }
                    }

                    class Dog extends Animal {
                        void sound() {
                            System.out.println("Dog barks");
                        }
                    }


        Method Signature:
        =================
            The method signature consists of the method name and the parameter list. It does not include the return type or access modifier.


            Example:
                public static int add(int a, int b) {
                    return a + b;
                }
                // Method Signature: add(int, int)

        Method Overloading:
            Method overloading allows a class to have multiple methods with the same name but different parameter lists. The compiler determines which method to call based on the number and type of arguments passed.

            Example:
                public static int add(int a, int b) {
                    return a + b;
                }

                public static double add(double a, double b) {
                    return a + b;
                }
                

    
 */