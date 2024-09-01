/*
    Packages in Java
    *****************

        A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

            Built-in Packages (packages from the Java API)
            User-defined Packages (create your own packages)

        Advantages of using packages in Java:
            -> Packages help to avoid name conflicts
            -> They provide easier access control
            -> They make searching/locating and usage of classes easier
            -> Packages can be considered as data encapsulation (or data-hiding).

        Creating a package
        ------------------
            To create a package in Java, you need to understand two concepts:

                -> package statement
                -> import statement

            The package statement should be the first statement in the Java source file. There can be only one package statement in each source file, and it applies to all types in the file.

            If a package statement is not used, the class names are put into the default package, which has no name.

            The import statement is used to make the classes of another package accessible to the current package. The import statement tells the compiler to find the location of a class.

        Example of a package
        --------------------
            Let's create a package named mypackage. Inside the package, we have a class named A. The class A has a method named msg().

            File: A.java

                package mypackage;

                public class A {
                    public void msg() {
                        System.out.println("Hello");
                    }
                }

            File: B.java

                import mypackage.A;

                class B {
                    public static void main(String[] args) {
                        A obj = new A();
                        obj.msg();
                    }
                }

            To compile the A.java file, you need to use the following command:

                javac -d . A.java

            The -d . flag tells the compiler to put the generated class file in the current directory.

            To compile the B.java file, you need to use the following command:

                javac -d . B.java

            To run the B class, you need to use the following command:

                java mypackage.B

            Output:
                Hello

        Built-in Packages
        -----------------
            Java provides a large number of built-in packages. Some of the commonly used built-in packages are:

                -> java.lang: Contains language support classes (like String, Math, Object, System, etc)

                -> java.io: Contains classes for supporting input/output operations

                -> java.util: Contains utility classes

                -> java.applet: Contains classes for creating Applets

                -> java.awt: Contains classes for creating GUIs



        User-defined Packages
        ---------------------
            You can create your own packages in Java. For example, you can create a package named mypackage. Inside the package, you can have a class named A. The class A has a method named msg().

            File: A.java

                package mypackage;

                public class A {
                    public void msg() {
                        System.out.println("Hello");
                    }
                }

            File: B.java

                import mypackage.A;

                class B {
                    public static void main(String[] args) {
                        A obj = new A();
                        obj.msg();
                    }
                }

            To compile the A.java file, you need to use the following command:

                javac -d . A.java

            The -d . flag tells the compiler to put the generated class file in the current directory.

            To compile the B.java file, you need to use the following command:

                javac -d . B.java

            To run the B class, you need to use the following command:

                java mypackage.B

            Output:
                Hello

    
        Access Protection(Modifiers)
        -----------------
            Java provides four access control levels:

                -> Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

                -> Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

                -> Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

                -> Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package, and outside the package.

            The following table shows the access to members permitted by each modifier.

            Modifier    Class   Package Subclass    World
            ---------------------------------------------
            Public      Y       Y       Y           Y
            Protected   Y       Y       Y           N
            Default     Y       Y       N           N
            Private     Y       N       N           N

        Example of access protection
        ----------------------------
            Let's create a package named pack. Inside the package, we have a class named A. The class A has a method named msg() with different access modifiers.

            File: A.java

                package pack;

                public class A {
                    private void msg() {
                        System.out.println("Hello");
                    }

                    void msg1() {
                        System.out.println("Hello");
                    }

                    protected void msg2() {
                        System.out.println("Hello");
                    }

                    public void msg3() {
                        System.out.println("Hello");
                    }
                }

            File: B.java

                package mypackage;

                import pack.A;

                class B extends A {
                    public static void main(String[] args) {
                        A obj = new A();
                        obj.msg3();
                    }
                }

            To compile the A.java file, you need to use the following command:

                javac -d . A.java

            The -d . flag tells the compiler to put the generated class file in the current directory.

            To compile the B.java file, you need to use the following command:

                javac -d . B.java

            To run the B class, you need to use the following command:

                java mypackage.B

            Output:
                Hello


 */