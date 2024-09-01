/*
    Polymorphism
    **************

        Polymorphism is the ability of an object to take on many forms. 
        
        The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

       
        
 */

//  Example program to understand Polymorphism in Java:

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myDog = new Dog();  // Create a Dog object
        Animal myCat = new Cat();  // Create a Cat object

        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}




/*
    Overloading vs Overriding
    **************************

        Overloading
        -----------
            Overloading occurs when two or more methods in one class have the same method name but different parameters.
                Example:
                    int myMethod(int x)
                    float myMethod(float x)
        
        Overriding
        ----------
            Overriding means having two methods with the same method name and parameters (i.e., method signature). One of the methods is in the parent class and the other is in the child class.
                Example:
                    class Animal {
                        public void animalSound() {
                            System.out.println("The animal makes a sound");
                        }
                    }

                    class Dog extends Animal {
                        public void animalSound() {
                            System.out.println("The dog says: bow wow");
                        }
                    }

                
        Note:
            Overloading is an example of compile-time polymorphism, while overriding is an example of runtime polymorphism.
    
 */

 /*
  Static and Dynamic Binding(Compile-time and Runtime Polymorphism)
  ****************************
    
        Static Binding
        --------------
            Static binding is a binding in which the type of the object is determined at compile-time. It is also known as early binding.
            Example:
                class Animal {
                    void eat() {
                        System.out.println("animal is eating...");
                    }
                }
    
                class Dog extends Animal {
                    void eat() {
                        System.out.println("dog is eating...");
                    }
    
                    public static void main(String[] args) {
                        Animal a = new Dog();
                        a.eat();
                    }
                }
    
                Output:
                    animal is eating...
    
                In the above example, the eat() method of the Animal class is invoked because the type of the object is determined at compile-time. So, the binding between the method call and the method definition is done at compile-time. This is called static binding.



                
        
        Dynamic Binding
        ---------------
            Dynamic binding is a binding in which the type of the object is determined at run-time. It is also known as late binding.
    
            Example:
                class Animal {
                    void eat() {
                        System.out.println("animal is eating...");
                    }
                }
    
                class Dog extends Animal {
                    void eat() {
                        System.out.println("dog is eating...");
                    }
    
                    public static void main(String[] args) {
                        Animal a = new Dog();
                        a.eat();
                    }
                }
    
                Output:
                    dog is eating...
    
                In the above example, the eat() method of the Dog class is invoked at runtime. So, the binding between the method call and the method definition is done at runtime. This is called dynamic binding.
  */