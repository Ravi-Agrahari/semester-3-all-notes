/*
    Abstraction in Java
    ********************

        Abstraction is a process of hiding the implementation details and showing only functionality to the user.

        Another way, it shows only important things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.

        Abstraction lets you focus on what the object does instead of how it does it.

        Ways to achieve Abstraction
        ---------------------------

            There are two ways to achieve abstraction in java

                Abstract class (0 to 100%)
                Interface (100%)

        Abstract class in Java
        -----------------------

            A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

            Points to Remember
            ------------------

                An abstract class must be declared with an abstract keyword.
                It can have abstract and non-abstract methods.
                It cannot be instantiated.
                It can have constructors and static methods also.
                It can have final methods which will force the subclass not to change the body of the method.

            Example of Abstract class 
            -------------------------

                abstract class Shape {
                    abstract void draw();
                }

                class Rectangle extends Shape {
                    void draw() {
                        System.out.println("drawing rectangle");
                    }
                }

                class Circle extends Shape {
                    void draw() {
                        System.out.println("drawing circle");
                    }
                }

                class TestAbstraction1 {
                    public static void main(String args[]) {
                        Shape s = new Circle();
                        s.draw();
                    }
                }

            Output:
                drawing circle  







        Interface in Java
        -----------------

            An interface in Java is a blueprint of a class. It has static constants and abstract methods.

            The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

            Points to Remember
            ------------------

                It is used to achieve abstraction.
                By interface, we can support the functionality of multiple inheritance.
                It can be used to achieve loose coupling.

            Example of Interface
            ---------------------

                interface Printable {
                    void print();
                }

                class A6 implements Printable {
                    public void print() {
                        System.out.println("Hello");
                    }

                    public static void main(String args[]) {
                        A6 obj = new A6();
                        obj.print();
                    }
                }

            Output:
                Hello 







        Abstract class vs Interface
        ---------------------------

            Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can't be instantiated.

            Abstract class Interface
            -------------------------

                An abstract class can have a method body (non-abstract methods).
                Interface can't have a method body (non-abstract methods).


                An abstract class can have constructors.
                Interface can't have constructors.


                An abstract class can have final, non-final, static and non-static variables.
                Interface has only static and final variables.


                An abstract class can have static methods, main method, and so on.
                Interface can't have static methods. Interface can have a static method only if it is a default method.

                
                An abstract class can have a main() method.
                Interface can't have a main() method.
 */