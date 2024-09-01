/*
    Inheritence in Java
    *******************

        Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

        The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

        Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

        Why use inheritance in Java?
        ----------------------------

            For Method Overriding (so runtime polymorphism can be achieved).
            For Code Reusability.

        Syntax of Inheritance
        ---------------------

            class Subclass-name extends Superclass-name  
            {  
                //methods and fields  
            }  

        Example of Inheritance
        ----------------------

            class Animal {
                void eat() {
                    System.out.println("eating...");
                }
            }

            class Dog extends Animal {
                void bark() {
                    System.out.println("barking...");
                }
            }

            class TestInheritance {
                public static void main(String[] args) {
                    Dog d = new Dog();
                    d.bark();
                    d.eat();
                }
            }

        Types of Inheritance in Java
        ----------------------------

            There are five types of inheritance in Java:

                Single Inheritance
                Multiple Inheritance
                Multilevel Inheritance
                Hierarchical Inheritance
                Hybrid Inheritance

        Single Inheritance
        ------------------

            When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.

            class Animal {
                void eat() {
                    System.out.println("eating...");
                }
            }

            class Dog extends Animal {
                void bark() {
                    System.out.println("barking...");
                }
            }

        Multiple Inheritance
        --------------------

            When a class inherits more than one class, it is known as multiple inheritance. Java does not allow multiple inheritance. It gives compile-time error.

            class A {
                void msg() {
                    System.out.println("Hello");
                }
            }

            class B {
                void msg() {
                    System.out.println("Welcome");
                }
            }

            class C extends A, B {
                public static void main(String[] args) {
                    C obj = new C();
                    obj.msg(); //Now which msg() method would be invoked?
                }

            }

        Multilevel Inheritance
        ----------------------

            When we have a chain of classes, it is known as multilevel inheritance. As you can see in the example given below, Dog class inherits the Animal class, and Cat class inherits the Dog class.

            class Animal {
                void eat() {
                    System.out.println("eating...");
                }
            }

            class Dog extends Animal {
                void bark() {
                    System.out.println("barking...");
                }
            }

            class BabyDog extends Dog {
                void weep() {
                    System.out.println("weeping...");
                }
            }

        Hierarchical Inheritance
        ------------------------

            When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class.

            class Animal {
                void eat() {
                    System.out.println("eating...");
                }
            }

            class Dog extends Animal {
                void bark() {
                    System.out.println("barking...");
                }
            }

            class Cat extends Animal {
                void meow() {
                    System.out.println("meowing...");
                }
            }

        Hybrid Inheritance
        -----------------

            Hybrid inheritance is a combination of two or more types of inheritance. In the example given below, Dog class is inheriting the Animal class and the Animal class is inheriting the Mammal class.

            class Animal {
                void eat() {
                    System.out.println("eating...");
                }
            }

            class Mammal extends Animal {
                void drink() {
                    System.out.println("drinking milk...");
                }
            }

            class Dog extends Mammal {
                void bark() {
                    System.out.println("barking...");
                }
            }

        Points to Remember
        ------------------

            -> In Java, a class cannot extend more than one class.
            -> In Java, a class can implement more than one interface.
            -> Java supports multiple inheritance through interfaces.
            -> A class can extend only one class but can implement multiple interfaces.
            -> All Java classes (without any parent) are inherited from Object class implicitly.
            -> The Object class is the top class in Java. It is a parent class for all the classes.
 
            
        
 */
