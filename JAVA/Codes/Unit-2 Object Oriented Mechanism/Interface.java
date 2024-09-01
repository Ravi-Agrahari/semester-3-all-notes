/*
   Interface in java
   ******************

    An interface in java is a blueprint of a class. It has static constants and abstract methods.

    The interface in java is a mechanism to achieve abstraction. There can be only abstract methods in the java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

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

    Why use Java interface?
    ------------------------

        There are mainly three reasons to use interface. They are given below.

            -> It is used to achieve abstraction.

            -> By interface, we can support the functionality of multiple inheritance.

            -> It can be used to achieve loose coupling.


    

    

 */