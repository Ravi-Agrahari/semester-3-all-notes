/*
    Encapsulation in java
    **********************

        Encapsulation in java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

        We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

        The Java Bean class is the example of a fully encapsulated class.

        Points to remember
        ------------------

            -> We can make a class fully encapsulated by making all the data members of the class private.
            -> The private data members of the class can be accessed only in the class.
            -> The getter and setter methods are used to set and get the data in the object of the class.

        Example of Encapsulation
        ------------------------

            public class Student {
                private String name;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            class TestEncapsulation {
                public static void main(String[] args) {
                    Student s = new Student();
                    s.setName("vijay");
                    System.out.println(s.getName());
                }
            }

        Output:
            vijay
        

        In the above example, all the data members of the Student class are private
        so outside class, we can't access these data members directly. These data members are accessed using public methods.
        
 */
