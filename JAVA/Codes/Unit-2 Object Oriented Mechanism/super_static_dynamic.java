/*
    Super,Static and Final Keywords in Java
    ****************************

        Super Keyword
        -------------
            The super keyword in Java is a reference variable that is used to refer to the immediate parent class object. It is used to call the constructor of the parent class and to access the parent class properties and methods.

            Example:
                class Animal {
                    String color = "white";
                }

                class Dog extends Animal {
                    String color = "black";

                    void printColor() {
                        System.out.println(color); //prints color of Dog class
                        System.out.println(super.color); //prints color of Animal class
                    }

                    public static void main(String[] args) {
                        Dog d = new Dog();
                        d.printColor();
                    }
                }

                Output:
                    black
                    white

            In the above example, the color variable of the Dog class is accessed using the super keyword. If there is no super keyword, the color of the Dog class will be printed.

    
        Static Keyword
        --------------
            The static keyword in Java is used for memory management mainly. It is used to define the class members that belong to the class itself, not to the specific instance of the class. It can be a variable, method, block, or nested class.

            The static keyword belongs to the class than an instance of the class. The static can be:

                Variable (also known as a class variable)
                Method (also known as a class method)
                Block
                Nested class

            Example:
                class Student {
                    int rollno;
                    String name;
                    static String college = "ITS";

                    Student(int r, String n) {
                        rollno = r;
                        name = n;
                    }

                    void display() {
                        System.out.println(rollno + " " + name + " " + college);
                    }

                    public static void main(String args[]) {
                        Student s1 = new Student(111, "Karan");
                        Student s2 = new Student(222, "Aryan");

                        s1.display();
                        s2.display();
                    }
                }

                Output:
                    111 Karan ITS
                    222 Aryan ITS

            In the above example, the college variable is declared as static. It is used to print the common property of all objects (college name).


        Final Keyword
        -------------
            The final keyword in Java is used to restrict the user. The java final keyword can be used in many contexts. Final can be:

                Variable
                Method
                Class

            The final keyword can be applied with the variables, a final variable that has no value, is called a blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.

            Example:
                class Bike {
                    final int speedlimit = 90; //final variable

                    void run() {
                        speedlimit = 400;
                    }

                    public static void main(String args[]) {
                        Bike obj = new Bike();
                        obj.run();
                    }
                }

                Output:
                    Compile-time error

            In the above example, the final variable speedlimit is assigned a value only once. If we try to change the value of the final variable, we will get a compile-time error.


 */

//  Example of these keywords with inheritance and polymorphism

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

public class super_static_dynamic {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

/*
    Output:
        dog is eating...
        dog is eating...
 */