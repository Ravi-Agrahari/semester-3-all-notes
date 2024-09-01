/*

Control Statements:
*******************

    Conditional Statements:
         if, if-else, switch.

    Looping Statements:
         for, while, do-while.

    Branching Statements:
         break, continue, return.

    *Note: all are same like c programming.

    1. if statement:
    ----------------
        The if statement is used to execute a block of code only if a specified condition is true.

        Syntax:
            if (condition) {
                // block of code to be executed if the condition is true
            }

        Example:
            int x = 10;
            if (x > 5) {
                System.out.println("x is greater than 5");
            }



    2. if-else statement:
    ---------------------
        The if-else statement is used to execute a block of code if the condition is true, and another block of code if the condition is false.

        Syntax:
            if (condition) {
                // block of code to be executed if the condition is true
            } else {
                // block of code to be executed if the condition is false
            }

        Example:
            int x = 10;
            if (x > 5) {
                System.out.println("x is greater than 5");
            } else {
                System.out.println("x is less than or equal to 5");
            }


    3. switch statement:
    --------------------
        The switch statement is used to select one of many code blocks to be executed.

        Syntax:
            switch (expression) {
                case value1:
                    // block of code to be executed if expression is equal to value1
                    break;
                case value2:
                    // block of code to be executed if expression is equal to value2
                    break;
                ...
                default:
                    // block of code to be executed if expression is not equal to any value
            }

        Example:
            int day = 3;
            switch (day) {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                ...
                default:
                    System.out.println("Invalid day");
            }

    
    4. for loop:
    ------------
        The for loop is used to execute a block of code a specified number of times.

        Syntax:
            for (initialization; condition; increment/decrement) {
                // block of code to be executed
            }

        Example:
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }

    

    5. while loop:
    --------------
        The while loop is used to execute a block of code as long as a specified condition is true.

        Syntax:
            while (condition) {
                // block of code to be executed
            }

        Example:
            int i = 0;
            while (i < 5) {
                System.out.println(i);
                i++;
            }


    
    6. do-while loop:
    -----------------
        The do-while loop is similar to the while loop, but the block of code is executed at least once, even if the condition is false.

        Syntax:
            do {
                // block of code to be executed
            } while (condition);

        Example:
            int i = 0;
            do {
                System.out.println(i);
                i++;
            } while (i < 5);


    7. break statement:
    -------------------
        The break statement is used to exit a loop or switch statement.

        Example:
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    break;
                }
                System.out.println(i);
            }
    

    8. continue statement:
    ----------------------
        The continue statement is used to skip the current iteration of a loop and continue with the next iteration.

        Example:
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    continue;
                }
                System.out.println(i);
            }

    9. return statement:
    ---------------------
        The return statement is used to exit a method and return a value.

        Example:
            public int add(int a, int b) {
                return a + b;
            }

    

 */


