/*
    * Wrapper Classes in Java
    **************************
        Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        The table below shows the primitive data types and their corresponding wrapper classes:

        Primitive Data Type     Wrapper Class
        -------------------     -------------
        byte                    Byte
        short                   Short
        int                     Integer
        long                    Long
        float                   Float
        double                  Double
        boolean                 Boolean
        char                    Character

        Example:
            int num = 10; // primitive data type
            Integer number = Integer.valueOf(num); // wrapper class
            System.out.println(number);
        
        Autoboxing:
            The process of converting a primitive data type to its corresponding wrapper class is called autoboxing.
            Example:
                int num = 10;
                Integer number = num; // autoboxing

        Unboxing:
            The process of converting a wrapper class object to its corresponding primitive data type is called unboxing.
            Example:
                Integer number = Integer.valueOf(10);
                int num = number; // unboxing
 */